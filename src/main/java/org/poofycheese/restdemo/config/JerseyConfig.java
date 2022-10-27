package org.poofycheese.restdemo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		
		packages("org.poofycheese.restdemo.resource");
	}
}
