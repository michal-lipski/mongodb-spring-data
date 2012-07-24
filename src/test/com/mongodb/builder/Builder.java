
package com.mongodb.builder;

/**
 * Base class for builders.
 *
 * @author mlipski
 */
public abstract class Builder<T> {

	/**
	 * Builds actual object from builder.
	 *
	 * @return build target object
	 */
	public abstract T build();

}
