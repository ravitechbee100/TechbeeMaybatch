package week1;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
//		Write a Java Program to find the second highest value in a numeric array.
		int [] a= {3,5,66,7,88,9,4};
		System.out.println(Arrays.toString(a));
		int n=a.length;
		System.out.println("The second highest element is: "+geSsecondHighest(a, n));
		

	}
	//get the second highest element in the array
	public static int geSsecondHighest(int[] arr, int n) {
		n = arr.length;

		orderedArray(arr);
		int secondHighestElement= arr[n-2];
		return secondHighestElement;

	}

	//Order the array asc
	public static int[] orderedArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		
			
		
		return arr;

	}

}
