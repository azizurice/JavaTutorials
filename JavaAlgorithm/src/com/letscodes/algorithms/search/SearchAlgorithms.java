package com.letscodes.algorithms.search;



public class SearchAlgorithms {

	public static void main(String[] args) {
		int [] data={1,2,3};
		 //data=null;
		//Arrays.sort(data);
		
		int searchTerm=3;
		int index=binarySearch(data, searchTerm);
		if (index == -1){
			System.out.println(searchTerm + " does not exist in the given array");
		} else{
			System.out.println(searchTerm + " exist at the position :"+index);
		}
	
	}

	public static int binarySearch(int[] sortedArray, int searchTerm){
		if ((sortedArray==null)|| (sortedArray.length <0)){
			return -1;
		} else {
			
			int lowerIndex=0;
			int higherIndex = sortedArray.length - 1;
			int mid=-1;
			while(lowerIndex <= higherIndex){
				 mid = lowerIndex +((higherIndex-lowerIndex)/2);
			
				if (sortedArray[mid] < searchTerm){
					lowerIndex = mid+1;
				} else if (sortedArray[mid] > searchTerm){
					higherIndex=mid-1;
				} else{
					return mid;
				}
			}
			return -1;
		
		}
	}
}
