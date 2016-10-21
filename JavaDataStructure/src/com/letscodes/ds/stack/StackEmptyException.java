package com.letscodes.ds.stack;

public class StackEmptyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackEmptyException(String error){
		super(error);
	}
}
