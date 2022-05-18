package week1;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
//		Write a Java Program to remove a particular element from an array. 
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println("Before :" + Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of element which to remove: ");
		int index = sc.nextInt();
		int[] b = removeElement(a, index);
		System.out.println("After :" + Arrays.toString(b));

	}

	public static int[] removeElement(int[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}

		int[] arr1 = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			arr1[j++] = arr[i];
		}

		return arr1;

	}

}
