/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adraood.homebox;

/**
 *
 * @author boby
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.adraood.homebox.db.Controllers;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
 
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
    EntityManagerFactory factory;
    EntityManager em;
    public MyResource(){
        factory = Persistence.createEntityManagerFactory("com.adraood_HomeBox_PU");
        em = factory.createEntityManager();
    }
 
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        Query q=em.createNativeQuery("select * from Controllers", Controllers.class);
        List<Controllers> cntrls=q.getResultList();
        return cntrls.get(0).getName();
    }
}