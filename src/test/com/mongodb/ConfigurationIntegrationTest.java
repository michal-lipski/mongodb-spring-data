
package com.mongodb;

import static com.mongodb.builder.Builders.aPerson;
import static com.mongodb.builder.Builders.aPersonWithAccount;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import com.mongodb.domain.Person;
import com.mongodb.repository.PersonRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ConfigurationIntegrationTest {

	@Autowired
	Mongo mongo;

	@Autowired
	PersonRepository repository;

	@After
	public void cleanUp() {
		repository.deleteAll();
	}

	@Test
	public void shouldFindAllPersons() {
		List<Person> persons = repository.findAll();
		assertThat(persons.size(), is(0));
	}

	@Test
	public void shouldPersistPerson() {
		//given
		Person person = aPersonWithAccount().build();
		//when
		Person savedPerson = repository.save(person);
		repository.findOne(savedPerson.getId());
		//then
		assertThat(savedPerson.getId(), is(equalTo("1")));
	}

	@Test
	public void shouldPersistPersonWithoutAccount() {
		//given
		Person person = aPerson().withName("Bob").withoutAccount().build();
		//when
		Person savedPerson = repository.save(person);
		repository.findOne(savedPerson.getId());
		//then
		assertThat(savedPerson, is(equalTo(person)));
	}


}
