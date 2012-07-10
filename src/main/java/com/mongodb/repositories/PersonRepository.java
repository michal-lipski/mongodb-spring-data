package com.mongodb.repositories;

import java.util.List;

import com.mongodb.domain.Person;
import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;


/**
 * Simple repository interface to manage {@link com.mongodb.domain.Person} instances.
 * 
 * @author mlipski
 */
public interface PersonRepository extends CrudRepository<Person, ObjectId>, QueryDslPredicateExecutor<Person> {

	/**
	 * Queries {@link Person}s by filtering on {@code Account}.
	 * 
	 * @param type type of person account
	 * @return list of persons
	 */
	List<Person> findByAccountsType(String type);


	/**
	 * Returns all {@link Person} with a {@link com.mongodb.domain.Account} title like the given
	 * parameter.
	 * 
	 * @param type type of person account
	 * @return list of persons
	 */
	List<Person> findByAccountsTypeLike(String type);


}
