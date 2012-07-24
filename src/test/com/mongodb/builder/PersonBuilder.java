
package com.mongodb.builder;

import java.util.ArrayList;

import com.google.common.cache.CacheBuilder;
import com.mongodb.domain.Account;
import com.mongodb.domain.Person;

/**
 * Builder for Person class
 *
 * @author mlipski
 */
public class PersonBuilder extends Builder<Person>{

	private Person person;
	
	public PersonBuilder() {
		person = new Person();
	}
	
	public PersonBuilder withId(String id){
		person.setId(id);
		return this;
	}

	public PersonBuilder withName(String name){
		person.setName(name);
		return this;
	}

	public PersonBuilder with(Account account) {
		person.getAccounts().add(account);
		return this;
	}

	public PersonBuilder withoutAccount() {
		person.setAccounts(new ArrayList<Account>());
		return this;
	}

	public Person build(){
		return person;
	}
}
