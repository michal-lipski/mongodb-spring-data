/**
 * Copyright 2011 Nokia Siemens Networks 
 */
package com.mongodb.repository;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import com.mongodb.domain.Person;
import com.mongodb.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO mlip; javadoc
 *
 * @author mlipski
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PersonRepositoryTests {

	@Autowired
	PersonRepository repository;

	@Test
	public void readsFirstPageCorrectly() {

		List<Person> persons = repository.findAll();
		assertThat(persons.size(), is(1));
	}
}
