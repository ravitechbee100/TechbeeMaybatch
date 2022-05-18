import java.util.Scanner;

public class Add2Integer {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int number1 = scan.nextInt();
		System.out.println("Enter second integer: ");
        int number2 = scan.nextInt();
        int sum = number1 + number2;
        System.out.println();
        System.out.println("The sum is: " +sum);
		
		
	}
	
	

}
