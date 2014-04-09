/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adraood.homebox.rest.resources;

/**
 *
 * @author boby
 */
import com.adraood.homebox.entity.Controller;
import com.adraood.homebox.entity.DBInit;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
/**
 * Root resource (exposed at "myresource" path)
 */
@Component
@Path("/myresource")
public class MyResource {
    @Autowired
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
    @GET @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Controller> getIt(@PathParam ("id")Integer id) {
        return db.getCntrl(id);
    }
}