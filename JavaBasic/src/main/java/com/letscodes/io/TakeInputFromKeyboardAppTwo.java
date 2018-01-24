package com.letscodes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInputFromKeyboardAppTwo {
	public static void main(String[] args) throws IOException {

		// Read input from keyboard by the helper BufferedReader
		
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("Enter the first number:");
		 String firstToken=bufferReader.readLine();
		 System.out.println("Enter the second number:");
		 String secondToken=bufferReader.readLine();
		 
		 //Cast the string into int using Integer wrapper class.
		 	
		 int firstNumber =Integer.valueOf(firstToken);
		 int secondNumber = Integer.valueOf(secondToken);
		 
		 
		
		
		
		// Process
		int sum = firstNumber + secondNumber;

		// Output by the helper class System.

		System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is :" + sum);
	}

}