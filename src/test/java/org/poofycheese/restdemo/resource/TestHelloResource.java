package org.poofycheese.restdemo.resource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URISyntaxException;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.poofycheese.restdemo.AbstractRestDemoApplicationTests;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(Lifecycle.PER_CLASS)
public class TestHelloResource extends AbstractRestDemoApplicationTests {
	
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
