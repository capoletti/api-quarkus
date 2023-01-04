package com.cpoletti;


import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.beans.Transient;
import java.util.List;

@Path("/frutas")
public class FrutasResource {


    @Inject
    FrutasService frutasService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> list(){
        return  frutasService.list();
    }

    @POST
    public void create(){
        frutasService.create();
    }
}
