package org.poofycheese.restdemo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.poofycheese.restdemo.model.Person;
import org.poofycheese.restdemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/person")
public class PersonResource {

	@Autowired
	private PeopleService peopleService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	public Person getPersoneByName(@PathParam("name") String name){
		return peopleService.getPersonByName(name);
	}
}
