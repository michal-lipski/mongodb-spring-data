/**
 * Copyright 2011 Nokia Siemens Networks 
 */
package com.mongodb;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sample application to call mongodb example
 *
 * @author mlipski
 */
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		SimpleOperations simpleOperations = context.getBean(SimpleOperations.class);
		simpleOperations.run();

		MapReduce mapReduceExample = context.getBean(MapReduce.class);
		mapReduceExample.run();

	}

}
