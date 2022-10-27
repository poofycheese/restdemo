package org.poofycheese.restdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.poofycheese.restdemo.resource.HelloResource;
import org.poofycheese.restdemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestDemoApplication{

	private static final Logger log=  LogManager.getLogger(HelloResource.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}
}
