package org.poofycheese.restdemo;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class AbstractRestDemoApplicationTests {

	@LocalServerPort
    protected int port;
	
    protected WebTarget webTarget;

    @BeforeAll
    public void setUp() throws Exception {
        URI baseUri = new URI("http://localhost:" + port + "/");
          
        Client client = ClientBuilder.newClient();
        this.webTarget = client.target(baseUri).path("rest/");
    }

}
