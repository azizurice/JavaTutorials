package com.letscodes.algorithms.string;

public class StringManipulation {

	public static void main(String[] args) {
		String str="This is a nice book";
		String pattern =  "nice";
		int index= patternExistAt(str, pattern);
		System.out.println("The pattern "+ pattern + " exist in the give string at "+ index  );
		
		System.out.println("The sume of the number are : "+toDigit(1234));
		
	}

	// Time Complexity at worst case O(nm) where n is the length of the text and m is the length of pattern
	private static int patternExistAt(String str, String pattern) {
		char [] text = str.toCharArray();
		char [] p = pattern.toCharArray();
		for(int i=0; i<(str.length()-pattern.length()); i++){
			int j=0;
			while((j<p.length) && (p[j]==text[i+j])){
				j++;
				 if (j==p.length) return i;
			}
		   
		}
		return 0;
	}
	
	private static int toDigit(Integer num){
		int sum=0;
		int divisor=10;
		while(num>10 ){
			//p = p+ String.valueOf(num%10);
			System.out.println(num%10);
			sum = sum+(num%10);
			
			num=num/10;
		}
		sum=sum+num;
		return sum;
	}
	

}
