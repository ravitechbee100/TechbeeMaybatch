package week1;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		//  Write a Java Program to reverse the array contents. 
		int[]a = {2,5,7,9,0};
		String[]b= {"hello","world","How","are","you"};
		reverseArray(a);
		System.out.println();
		reverseArrayString(b);
		}
	public static int[] reverseArray(int[] arr) {
	for (int i=arr.length-1;i>=0; i--) { 
		System.out.print(arr[i]+" ");
	}
	return arr;
	
	}
	
	
	
	public static void reverseArrayString(String[] arr) {
	
		System.out.println("Before reverse: "+Arrays.toString(arr));
	     
	      for(int i = 0; i< arr.length / 2; i++)
	      {
	         String temp = arr[i];
	         arr[i] = arr[arr.length - i - 1];
	         arr[arr.length - i - 1] = temp;
	      }
	      System.out.println("Afrer reverse : "+ Arrays.toString(arr));
	      
	      
	     
	      
	      

	
	
	
	}
	

}
