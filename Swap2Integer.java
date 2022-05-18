import java.util.Scanner;

public class Swap2Integer {
	
	
	
	 public static void main(String[] args) {
		   
		    int a, b, container;
		    
		    Scanner swapNumbeer = new Scanner(System.in);
		    
		    System.out.println("Enter first integer: ");
		     a = swapNumbeer.nextInt();
			 System.out.println("Enter second integer: ");
			 b = swapNumbeer.nextInt();
			 
			 
			
		    
			 container = a;
			 a  = b;
			 b = container;
			    
			 System.out.println("After swap first integer is:" + a + " second integer is:" + b);
		     
		    
		    
		
	}


}
