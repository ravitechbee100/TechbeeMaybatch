package week1javaeasicexecices;

import java.util.Scanner;

public class SumAverageRunninInt {

	public static void main(String[] args) {
		
	
		double Average=00.d;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the lowebound value: ");
		int lowerbound=sc.nextInt();
		System.out.println("the upperbound value: ");
		int upperbound=sc.nextInt();
		
		for (int i = lowerbound; i <= upperbound; i++) {
			sum=sum+i;
			Average=sum/upperbound;
		}
		System.out.println("The sum of "+lowerbound+" to "+upperbound+" is :"+sum+"\n"+"The average is :"+ Average);
		

	}

}
