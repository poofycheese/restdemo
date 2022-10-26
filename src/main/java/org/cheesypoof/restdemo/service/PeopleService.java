package org.cheesypoof.restdemo.service;

import java.util.List;

import org.cheesypoof.restdemo.mapper.PersonMapper;
import org.cheesypoof.restdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
	
	@Autowired
	private PersonMapper personMapper;
	
	public Person getPersonByName(String name) {
		
		return personMapper.getPersonByName(name);
	}
	
	public List<Person> getPeople(){
		return personMapper.getPeople();
	}
	
}
