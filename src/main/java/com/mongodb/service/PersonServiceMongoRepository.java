package com.mongodb.service;

import java.util.List;

import com.mongodb.domain.Person;
import com.mongodb.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceMongoRepository {
	Logger logger = LoggerFactory.getLogger(PersonServiceMongoRepository.class);

	@Autowired
	private PersonRepository repository;

	public void perfrmSampleOperations() {
		List<Person> personList = repository.findAll();
		System.out.println("personList = " + personList.size());
	}

}
