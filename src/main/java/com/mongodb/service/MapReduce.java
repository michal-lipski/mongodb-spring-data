/**
 * Copyright 2011 Nokia Siemens Networks 
 */
package com.mongodb.service;

import com.mongodb.domain.ValueObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapreduce.MapReduceResults;
import org.springframework.stereotype.Service;

/**
 * Sample map reduce operation on mongodb
 *
 * @author mlipski
 */
@Service
public class MapReduce {
	Logger logger = LoggerFactory.getLogger(PersonServiceMongoOperations.class);

	@Autowired
	MongoOperations mongoOperations;

	/**
	 * performs reduce function that will count number the same value of persons account balance at person collection
	 */
	public void run() {

		MapReduceResults<ValueObject> results = mongoOperations.mapReduce("person", "classpath:map-reduce/map.js", "classpath:map-reduce/reduce.js", ValueObject.class);
		for (ValueObject valueObject : results) {
			logger.info(valueObject.toString());
		}
	}
}
