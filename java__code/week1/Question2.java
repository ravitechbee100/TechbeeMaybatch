package week1;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
//		Create a Java Program to Sort an Array of Numeric Data.
		int[] a = { 13, 44, 6, 85, 9 };
		sortIntArray(a);
		sortIntArrayVersionTwo(a);
		
//		Create a Java Program to Sort an Array of String Data.	
		String b[]= {"Bob","Albert","California","Texas","Ocean"};
		sortStringArray(b);
	}
	public static int[] sortIntArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
		}
		System.out.println(Arrays.toString(arr));
		return arr;
		}
	public static String[] sortStringArray(String string[]) {
		for (int i = 0; i < string.length; i++) {
			Arrays.sort(string);
			}
		System.out.println(Arrays.toString(string));
		return string;
	}
	
	public static int[] sortIntArrayVersionTwo(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				int temp=0;
				if(arr[i]> arr[j])
				  {      
		               temp=arr[i];
		               arr[i]=arr[j];
		               arr[j]=temp;
		            }
				
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
			System.out.println();
		}
		return arr;
		
	}
	

}
