package org.cheesypoof.restdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cheesypoof.restdemo.model.Person;

@Mapper
public interface PersonMapper {
		
	public Person getPersonByName(String name); 
	
	public List<Person> getPeople();
}
