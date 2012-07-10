/**
 * Copyright 2011 Nokia Siemens Networks 
 */
package com.mongodb.domain;

/**
 * TODO mlip; javadoc
 *
 * @author mlipski
 */
public class ValueObject {

	private String id;
	private float value;

	public String getId() {
		return id;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ValueObject [id=" + id + ", value=" + value + "]";
	}
}
