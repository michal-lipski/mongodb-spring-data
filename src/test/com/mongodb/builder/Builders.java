package com.mongodb.builder;

/**
 * Class for storing all sample builders.
 *
 * @author mlipski
 */
public class Builders {

	public static AccountBuilder anAccount(){
		return new AccountBuilder().withId("1");
	}
	
	public static PersonBuilder aPersonWithAccount(){
		return new PersonBuilder().withId("1").with(anAccount().build());
	}

	public static PersonBuilder aPerson(){
		return new PersonBuilder().withId("1").withName("Sample Person");
	}
	
}
