package week1javaeasicexecices;

import java.util.Scanner;

public class Add2Integers {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first ineger : ");
		int n1=sc.nextInt();
		System.out.println("Enter second enteger : ");
		int n2=sc.nextInt();
		int sum=n1 + n2;
		System.out.println("The sum is : "+sum);

	}

}
