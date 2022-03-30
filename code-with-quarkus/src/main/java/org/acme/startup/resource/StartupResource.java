package org.acme.startup.resource;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.*;

import org.acme.startup.entity.Startup;

import java.util.List;

@Path("/startup")
public class StartupResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON) 
    public List<Startup> list() {
        return Startup.listAll();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON) 
    public void create(Startup startup) {
        System.out.println("mas até aqui funciona?");
       // Startup.persist(startup);
    }
} 