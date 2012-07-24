
package com.mongodb.domain;

/**
 * Object for stroing id, value pair.
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
