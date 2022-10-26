package org.cheesypoof.restdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cheesypoof.restdemo.mapper.PersonMapper;
import org.cheesypoof.restdemo.resource.HelloResource;
import org.cheesypoof.restdemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class RestdemoApplication implements  CommandLineRunner{

	private static final Logger log=  LogManager.getLogger(HelloResource.class);
	
	
	
	@Autowired
	private PeopleService peopleService;
	
	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		log.error(">>>>>>>>>>>>" + peopleService.getPersonByName("Zed"));
	}

	
}
