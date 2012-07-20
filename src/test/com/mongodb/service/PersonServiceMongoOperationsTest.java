/**
 * Copyright 2011 Nokia Siemens Networks 
 */
package com.mongodb.service;

import com.mongodb.service.MapReduce;
import com.mongodb.service.PersonServiceMongoOperations;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sample application to call mongodb example
 *
 * @author mlipski
 */
public class PersonServiceMongoOperationsTest {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		PersonServiceMongoOperations personServiceMongoOperations = context.getBean(PersonServiceMongoOperations.class);
		personServiceMongoOperations.performSampleOperations();

		MapReduce mapReduceExample = context.getBean(MapReduce.class);
		mapReduceExample.run();

	}

}
