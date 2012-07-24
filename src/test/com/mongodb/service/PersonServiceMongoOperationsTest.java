
package com.mongodb.service;

import com.mongodb.repository.PersonRepository;
import com.mongodb.service.MapReduce;
import com.mongodb.service.PersonServiceMongoOperations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test to call mongodb example.
 *
 * @author mlipski
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PersonServiceMongoOperationsTest {

	@Autowired
	PersonServiceMongoOperations personServiceMongoOperations;

	@Autowired
	MapReduce mapReduce;

	@Test
	public void shouldPerformSampleOperations() {
		personServiceMongoOperations.performSampleOperations();
	}

	@Test
	public void shouldPerformSampleMapReduceOperations() {
		mapReduce.run();
	}

}
