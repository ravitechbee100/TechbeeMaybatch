package week1javaeasicexecices;

import java.util.Scanner;

public class Swap2Integers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first ineger : ");
		int n1=sc.nextInt();
		System.out.println("Enter second enteger : ");
		int n2=sc.nextInt();
		
		System.out.println("Before swap : number1 ="+n1+ " and number2 ="+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swap : number1 ="+n1+ " and number2 ="+n2);

	}

}
