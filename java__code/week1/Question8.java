package week1;

import java.util.Arrays;
import java.util.Random;

public class Question8 {

	public static void main(String[] args) {
		// Write a Java Code a Array of length 100 and fill it with Random int Values for testing purpose.
		Random r= new Random();
		
		int a[]=new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt(100);//I give range 1-100
		}
		System.out.println(Arrays.toString(a));
	}
	
	

}
