package week1javaeasicexecices;

import java.util.Scanner;

public class PrintDayInWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number in range 1-7 :");
		int day=sc.nextInt();
		switch (day) {
		case 1:
			System.out.print("SUNDAY");
			break;
		case 2:
			System.out.print("MONDAY");
			break;
		case 3:
			System.out.print("TUESDAY");
			break;
		case 4:
			System.out.print("WEDNESDAY");
			break;
		case 5:
			System.out.print("THURSDAY");
			break;
		case 6:
			System.out.print("FRIDAY");
			break;
		case 7:
			System.out.print("SATURDAY");
			break;
		
		default:
			System.out.println("Not a valid day! ");
			break;
		}

	}


	}


