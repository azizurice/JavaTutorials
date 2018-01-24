package com.letscodes.io;

import java.util.Scanner;

public class TakeInputFromKeyboardAppOne {
	public static void main(String[] args) {
		
		// Read input from keyboard by the helper class Scanner
		Scanner scanner=new Scanner(System.in);
		
		String firstToken =scanner.next();
		String secondToken =scanner.next();
		
		scanner.close();  // close the scanner
		
		// Cast these string input into int by the wrapper class Integer
		int firstNumber =Integer.valueOf(firstToken);
		int secondNumber =Integer.valueOf(secondToken);
		
		// Process
		int sum=firstNumber+secondNumber;
		
		
		// Output by the helper class System.
		
		System.out.println("The sum of "+firstNumber +" and "+secondNumber +" is :"+sum);
		
}
	
	

}

		
