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
import com.adraood.homebox.db.Controllers;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
 
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
    DBInit db;
    public MyResource(){
        db=new DBInit();
    }
 
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @param id
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@QueryParam ("id")Integer id) {
        return DBInit.ObjToJson(db.getCntrl(id));
    }
}