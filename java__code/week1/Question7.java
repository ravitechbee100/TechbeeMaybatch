package week1;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		// Create a Java code to copy an Array into another array.
		int[]a= new int[]{4,6,5,8,9,2};
		int[] b= new int[a.length];	
	    copyArray(a, b);
	
	}
	public static int []copyArray(int[]arr, int [] arr2){
		System.out.println("Original array arr: "+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i];
		}
		
		System.out.println("Copy of the original arrcopy :"+Arrays.toString(arr2));
		
		return arr2;
	}

}
