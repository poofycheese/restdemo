package org.cheesypoof.restdemo.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cheesypoof.restdemo.model.Person;
import org.cheesypoof.restdemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;

@Path("people")
public class PeopleResource {

	@Autowired
	private PeopleService peopleService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getAllPeople(){
		return peopleService.getPeople();
	}
}
