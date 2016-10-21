package com.letscodes.ds.stack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Azizur
 *
 */
public class MyStackTest {
	MyStack<Integer> myStack;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		myStack=new MyStack<>(1);  // Stack size set as 1
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		myStack=null;
	}

	@Test
	public void testGetMaxCapacityShouldBeOne() {
		assertEquals(1, myStack.getMaxCapacity());
	}
	
	@Test
	public void testSizeShouldBeZero() {
		assertEquals(0, myStack.size());
	}
	

	@Test
	public void testSizeShouldBeOne() {
		myStack.push(55);
		assertEquals(1, myStack.size());
	}


	@Test(expected = StackFullException.class)  
	public void testPushShouldThrowStackFullException() {
		myStack.push(1);
		myStack.push(2); // It would throw StackFullException
	}
	
	@Test(expected = StackEmptyException.class)  
	public void testPullShouldThrowStackEmptyException() {
		
		myStack.push(1);
		
		myStack.pull();
		myStack.pull(); // when executing, this lien throw StackEmptyException
		
	}

	@Test
	public void testPullShouldSendTheLastPushedElementAndRemovetheElementFromStack() {
		MyStack<String> myStack =new MyStack<String>(5);
		myStack.push("Cantaloupe");
		myStack.push("Banana");
		myStack.push("Honey Dew");
		
		String element=myStack.pull();
		assertEquals("Honey Dew", element);
		assertEquals(2,myStack.size());  // top element removed, so size would be decreased one
		
	}
	
	@Test
	public void testTopShouldSendTheLastPushedElementButItWillNotRemovetheElementFromStack() {
		MyStack<String> myStack =new MyStack<String>(5);
		myStack.push("Cantaloupe");
		myStack.push("Banana");
		myStack.push("Honey Dew");
		
		String element=myStack.top();
		assertEquals("Honey Dew", element);
		assertEquals(3,myStack.size());  // top element is not removed, so size would be the same as before.
		
	}
	
	
	
	

}
