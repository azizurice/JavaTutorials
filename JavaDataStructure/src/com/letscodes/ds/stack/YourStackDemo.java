package com.letscodes.ds.stack;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;

public class YourStackDemo {

	public static void main(String[] args) {
		MyStack<String> myStack =new MyStack<String>(5);
		myStack.push("Cantaloupe");
		myStack.push("Banana");
		myStack.push("Honey Dew");
		myStack.push("Blue Berry");
		myStack.push("Lemon");

		
		
		System.out.println("Top of the stack is :"+myStack.pull());
		
		
		
		
	}

	private final class RandomStringGenerator{ 
	  private SecureRandom random = new SecureRandom();

		  // Generate random session Identifier
		  public String nextSessionId() {
		    return new BigInteger(130, random).toString(32);
		  }
		  public String randomUUID(){
			  return UUID.randomUUID().toString();
			  
		  }
		  
		  public String customRandomString(int len){
			  final String alphaNumeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			  
			  StringBuilder randomString = new StringBuilder( len );
			     for( int i = 0; i < len; i++ ) 
			        randomString.append(alphaNumeric.charAt( random.nextInt(alphaNumeric.length()) ) );
			     return randomString.toString();
			  
		  }
		  
//		  public String randomStringUsingDollar(int len){ 
//		 // String validCharacters = $('0', '9').join() + $('A', 'Z').join();
//
//		      return $(validCharacters).shuffle().slice(length).toString();
//		  }
		  
		}
	
}
