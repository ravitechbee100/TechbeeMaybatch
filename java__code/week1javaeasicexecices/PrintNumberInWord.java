package week1javaeasicexecices;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number in range 1-9 :");
		int num=sc.nextInt();
		switch (num) {
		case 1:
			System.out.print("ONE");
			break;
		case 2:
			System.out.print("TWO");
			break;
		case 3:
			System.out.print("THREE");
			break;
		case 4:
			System.out.print("FORE");
			break;
		case 5:
			System.out.print("FIVE");
			break;
		case 6:
			System.out.print("SIX");
			break;
		case 7:
			System.out.print("SEVEN");
			break;
		case 8:
			System.out.print("EIGHT");
			break;
		case 9:
			System.out.print("NINE");
			break;

		default:
			System.out.println("The number "+num+" is out of range ");
			break;
		}

	}

}
