package com.letscodes.algorithms.sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortingDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/data.txt");
		Scanner scan=new Scanner(file);
		int n=scan.nextInt();
		int p=scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=scan.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
