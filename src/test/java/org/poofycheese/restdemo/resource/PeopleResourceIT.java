package org.poofycheese.restdemo.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.poofycheese.restdemo.AbstractRestDemoApplicationTests;
import org.poofycheese.restdemo.model.Person;


@TestInstance(Lifecycle.PER_CLASS)
public class PeopleResourceIT extends AbstractRestDemoApplicationTests{

	@Test
	public void testGetPeople() {
		Response response = webTarget.path("people").request().get();
		assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
		
		List<Person> personList = response.readEntity( new GenericType<List<Person>>() {});
		assertEquals( 15,  personList.size() );
	}
	

}
