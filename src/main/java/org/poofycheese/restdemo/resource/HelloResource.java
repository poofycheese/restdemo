package org.cheesypoof.restdemo.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cheesypoof.restdemo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/hello")
public class HelloResource {

	private static final Logger log=  LogManager.getLogger(HelloResource.class);
	
	@Autowired
	private PersonMapper personMapper;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	public Response getPathParam(@PathParam ("name") String name) {
		log.info("Path param = "+ name );
		return Response.status(Response.Status.OK).entity(new String( "Hello, " + name)).build(); 
	
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getQueryParam(@QueryParam("name") String name) {
		log.info("Query Param " + name);
		return "Hi, " + name;
		
	}
	
}