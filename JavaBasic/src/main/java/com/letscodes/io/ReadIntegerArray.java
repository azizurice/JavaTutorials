package com.letscodes.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadIntegerArray {

	public static void main(String[] args) throws FileNotFoundException {
		int[][] data= new int[5][5];
	Scanner scan = new Scanner(new File("src/resource/text.txt"));
		int row=0;
		int col=0;
		while(scan.hasNextLine()){
			Scanner rowReader = new Scanner(scan.nextLine());
			col=0;
			while(rowReader.hasNext()){
				data[row][col] =rowReader.nextInt();
				col++;
			}
			row++;
			
		}
		
		
		for (int[] is : data) {
			for (int i : is) {
				System.out.print( i + " ");
			}
			System.out.println();
		}
	}

	
}
