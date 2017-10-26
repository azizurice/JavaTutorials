package com.letscodes.algorithms.matrix;

public class MatixManipulation {
	 static char bitmaps[][] =
	        {
	            { 'O', 'X', 'X', 'X', 'X' },
	            { 'X', 'O', 'O', 'O', 'X' },
	            { 'X', 'O', '#', 'O', 'X' },
	            { 'X', 'O', 'O', 'O', 'X' },
	            { 'X', 'X', 'X', 'X', 'X' },
	            { 'X', 'X', 'X', '#', '#' },
	            { 'X', 'X', 'X', 'X', 'X' }
	        };		 
	public static void main(String[] args) {
		System.out.println("Before applying floodfill");
		inspect();
		//floodFill(bitmaps, 0, 1, 'P', 'X');
		floodFill(bitmaps, 1, 1, '=', 'O');
		
		System.out.println("After applying floodfill");
		inspect();
		int[] aa=new int[Character.MAX_VALUE];
		System.out.println("Largest Value is :"+Character.MAX_VALUE + " Length is :"+aa.length);
	}
	
	public static void inspect() {
        for (int r = 0; r < bitmaps.length; r++) {
            for (int c = 0; c < bitmaps[r].length; c++) {
                System.out.print(bitmaps[r][c]);
            }
            System.out.print("\n");
        }
    }
	
 public static void  floodFill(char[][] bitmaps, int x, int y, char newColor, char oldColor) {
	 
	 		if (bitmaps ==null){
	 			throw new IllegalArgumentException("Could not pass a null as a bitmaps");
	 		}
	 		
	 		if (x < 0 || y < 0 || x >= bitmaps.length || y >= bitmaps[x].length) return;
	 		
	 		char color = bitmaps[x][y];

	        if ((color == newColor) || (oldColor != color)) return;

	        bitmaps[x][y] = newColor;

	        floodFill(bitmaps,x - 1, y, newColor, oldColor);
	        floodFill(bitmaps,x + 1, y, newColor, oldColor);
	        floodFill(bitmaps,x, y - 1, newColor, oldColor);
	        floodFill(bitmaps,x, y + 1, newColor, oldColor);
	    

//	public static void floodFill(bitmap[][], x, y, originalColour, targetColour) {
//		
//	}
}
 
}
