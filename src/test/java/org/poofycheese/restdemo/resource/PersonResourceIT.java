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
public class PersonResourceIT extends AbstractRestDemoApplicationTests{

	@Test
	public void testZed() {
		String zed = "Zed";
		Response response = webTarget.path("person/" + zed).request().get();
		assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
		
		Person person = response.readEntity (Person.class);
		assertEquals( "Zed", person.getName() );
		assertEquals( "M", person.getSex());
		assertEquals( 42 , person.getAge());
	}
	

}
