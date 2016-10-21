/**
 * 
 */
package com.letscodes.ds.stack;

/**
 * @author Azizur
 *
 */
// Array Based Implementation
public class MyStack<AnyType> implements OurStack<AnyType> {
	private static final int CAPACITY=200;
	private AnyType[] dataArray;
	private int top=-1;
	private int capacity;

	// Constructors
	public MyStack(){
		this(CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public MyStack(int capacity){
		this.capacity=capacity;
		dataArray=(AnyType[]) new Object[capacity];
	}
	
	@Override
	public void push(AnyType value) {  // push or insert the value at the top of the stack
	
		if (size()==getMaxCapacity()){
			throw new StackFullException("Stack Overflow");
		}else{
			dataArray[++top]=value;
		}
	
		
	}

	@Override
	public AnyType pull() {
		AnyType temp;
		if (isEmpty()){
			throw new StackEmptyException("Stack is Empty");
		}
		temp=dataArray[top];
		dataArray[top--]=null; // Deference current element and decrement top
		return temp;
	}

	@Override
	public int size() {
		return top+1;
	}

	@Override
	public boolean isEmpty() {
	
		return (top<0);
	}

	@Override
	public AnyType top() {
		
		if (isEmpty()){
			throw new StackEmptyException("Stack is Empty");
		}
		return dataArray[top];
		
	}

	public int getMaxCapacity(){
		return capacity;
	}

}
