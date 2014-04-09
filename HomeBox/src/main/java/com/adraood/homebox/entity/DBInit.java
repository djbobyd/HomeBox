/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adraood.homebox.entity;
import com.adraood.homebox.entity.Controller;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.sql.DataSource;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    EntityManagerFactory emf;
    EntityManager em;
    private static String PU_NAME="com.adraood_HomeBox_PU";
    public DBInit(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml", DBInit.class);
        //DataSource dataSource = (DataSource) ac.getBean("dataSource");
        em = (EntityManager) ac.getBean("EntityManager");
        //em=getEntityManagerFactory(dataSource).createEntityManager();
        //emf = Persistence.createEntityManagerFactory(PU_NAME);
        //em = emf.createEntityManager();
    }
    
  /* private EntityManagerFactory getEntityManagerFactory(DataSource ds) {
        if (emf == null) {
            Map properties = new HashMap();
            properties.put(PersistenceUnitProperties.NON_JTA_DATASOURCE,ds);
            emf = Persistence.createEntityManagerFactory(PU_NAME, properties);
        }
        return emf;
    }*/
    public List<Controller> getCntrl(int id){
        Query q=em.createNativeQuery("select * from Controllers where id=?1", Controller.class);
        q.setParameter(1, id);
        return q.getResultList();
    }
   /* public static String ObjToJson(Object o){
        
	ObjectMapper mapper = new ObjectMapper();
 
	try {
		return mapper.writeValueAsString(o);
 
	} catch (JsonGenerationException e) {
 
		Logger.getLogger(DBInit.class.getName()).log(Level.SEVERE, null, e);
 
	} catch (IOException ex) { 
            Logger.getLogger(DBInit.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return "";
    }*/
}
