package com.letscodes.ds.stack;

public interface OurStack<AnyType> {
	// Fundamental methods
	public void push(AnyType value);
	public AnyType pull();
	
	// Additional Methods
	
	public int size();
	public boolean isEmpty();
	public AnyType top();
	
}
