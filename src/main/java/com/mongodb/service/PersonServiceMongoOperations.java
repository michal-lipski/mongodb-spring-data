package com.mongodb.service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

import java.util.List;

import com.mongodb.domain.Account;
import com.mongodb.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceMongoOperations {
	Logger logger = LoggerFactory.getLogger(PersonServiceMongoOperations.class);

	// reference the operations on MongoTemplate instance is via its interface MongoOperations
	@Autowired
	MongoOperations mongoOperations;


	public void performSampleOperations() {

		if (mongoOperations.collectionExists(Person.class)) {
			mongoOperations.dropCollection(Person.class);
		}

		mongoOperations.createCollection(Person.class);

		Person p = new Person("John", 39);
		Account a = new Account("1234-59873-893-1", Account.Type.SAVINGS, 123.45D);
		p.getAccounts().add(a);

		mongoOperations.insert(p);


		Person p2 = new Person("Adam", 40);
		Account a2 = new Account("1234-59873-893-2", Account.Type.SAVINGS, 123.45D);
		p2.getAccounts().add(a2);

		mongoOperations.insert(p2);

		List<Person> results = mongoOperations.findAll(Person.class);
		logger.info("Results: " + results);

		// Find
		p = mongoOperations.findById(p.getId(), Person.class);
		logger.info("Found: " + p);

		// Update
		mongoOperations.updateFirst(query(where("name").is("John")), update("age", 35), Person.class);
		p = mongoOperations.findOne(query(where("name").is("John")), Person.class);
		logger.info("Updated: " + p);

		// Delete
		mongoOperations.remove(p);

		// Check that deletion worked
		List<Person> people = mongoOperations.findAll(Person.class);
		logger.info("Number of people = : " + people.size());


	}

}
