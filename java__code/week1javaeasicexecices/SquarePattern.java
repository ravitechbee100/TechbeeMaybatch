package week1javaeasicexecices;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter size:");
		int size=sc.nextInt();
		for (int i = 0; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.print(" # ");
			}
			System.out.println();
		}

	}

}
