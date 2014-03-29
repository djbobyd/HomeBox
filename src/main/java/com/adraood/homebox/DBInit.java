/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adraood.homebox;
import com.adraood.homebox.db.Controllers;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author boby 
 * 
 * 
 * opposite example
 * read from file, convert it to user class
 * User user = mapper.readValue(new File("c:\\user.json"), User.class);
 */
public class DBInit {
    EntityManagerFactory factory;
    EntityManager em;
    public DBInit(){
        factory = Persistence.createEntityManagerFactory("com.adraood_HomeBox_PU");
        em = factory.createEntityManager();
  }
    
    public List<Controllers> getCntrl(int id){
        Query q=em.createNativeQuery("select * from Controllers where id=?1", Controllers.class);
        q.setParameter(1, id);
        return q.getResultList();
    }
    public static String ObjToJson(Object o){
        
	ObjectMapper mapper = new ObjectMapper();
 
	try {
		return mapper.writeValueAsString(o);
 
	} catch (JsonGenerationException e) {
 
		Logger.getLogger(DBInit.class.getName()).log(Level.SEVERE, null, e);
 
	} catch (IOException ex) { 
            Logger.getLogger(DBInit.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return "";
    }
}
