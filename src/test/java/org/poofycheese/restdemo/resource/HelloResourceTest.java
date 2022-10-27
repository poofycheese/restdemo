package org.poofycheese.restdemo.resource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URISyntaxException;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.poofycheese.restdemo.AbstractRestDemoApplicationTests;

@TestInstance(Lifecycle.PER_CLASS)
public class HelloResourceTest extends AbstractRestDemoApplicationTests {
	
	@Test
	public void testHelloPath() throws URISyntaxException {
		String name = "Jenny";	
		Response response = webTarget.path("hello/" + name).request().get();
        
		assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals( "Hello, " + name, response.readEntity(String.class));
	}
	
	@Test
	public void testHelloQuery() {
		String name = "Annie";
		Response response = webTarget.path("hello").queryParam("name", name).request().get();
		
		assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
		assertEquals("Hi, " + name , response.readEntity(String.class) );
	}
	
}
