package week1javaeasicexecices;

import java.util.Arrays;
import java.util.Scanner;

public class Printarray {

	public static void main(String[] args) {
		int items[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items in the array:");
		int NUM_ITEMS=sc.nextInt();
		items=new int[NUM_ITEMS] ;
		
		
		
		System.out.println("Enter the items in the array (separated by space):");
		for (int i = 0; i < NUM_ITEMS; i++) {
			items[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(items));
		
		
	}
	

}
