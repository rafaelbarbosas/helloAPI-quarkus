package br.com.bb.compra.controller;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.bb.compra.service.HelloService;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/hello")
@Slf4j
public class HelloResource {
    
    @Inject
    @Named("helloServiceImpl")
    HelloService helloService;

    @GET
    public String getHelloMesage(){
        return "Hello!";
    }
    
    @GET
    @Path("/{name}")
    public String getHelloMesage(@PathParam("name") String name){
        return "Hello, " + name + "!";
    }

    @GET
    @Path("/{name}/horario")
    public String getHelloMesageHour(@PathParam("name") String name){
        return "Hello, " + name + "! "+
                helloService.getCurrentHour();
    }

}
