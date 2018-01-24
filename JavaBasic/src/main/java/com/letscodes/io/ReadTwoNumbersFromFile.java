package com.letscodes.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author Azizur
 *
 */

public class ReadTwoNumbersFromFile {

	public static void main(String[] args) throws IOException {
    	// Read input from keyboard by the helper BufferedReader
		String workingDir = System.getProperty("user.dir");
		
		BufferedReader bufferReader = new BufferedReader(new FileReader(workingDir+"/data/MarkList.txt"));
		
		// System.out.println("Enter the first number:");
		 String firstToken=bufferReader.readLine();
		// System.out.println("Enter the second number:");
		 String secondToken=bufferReader.readLine();
		 
		 bufferReader.close();
		 
		 //Cast the string into int using Integer wrapper class.
		 int firstNumber =Integer.valueOf(firstToken);
		 int secondNumber = Integer.valueOf(secondToken);
		 
		 
		
		
		
		// Process
		int sum = firstNumber + secondNumber;

		// Output by the helper class System.

		System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is :" + sum);

	}

}