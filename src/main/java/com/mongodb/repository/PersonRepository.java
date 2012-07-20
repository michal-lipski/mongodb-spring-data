package com.mongodb.repository;

import com.mongodb.domain.Person;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * Simple repository interface to manage {@link com.mongodb.domain.Person} instances.
 * 
 * @author mlipski
 */
public interface PersonRepository extends MongoRepository<Person, ObjectId>{

}
