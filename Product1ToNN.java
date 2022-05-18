
public class Product1ToNN {
	
	
long multiply = 1L;
	
	public static void main(String[] args) {
		
		Product1ToNN pro = new Product1ToNN();
		pro.printProductNumber(11); 
		
		
	}
	
	
	private void printProductNumber(int number) {
		
		   
		 
		  for(int i = 1; i <= number; i++) {
			  multiply *= i;
		  }
		  System.out.println("10 factorial is: " +multiply);
		
	}


}
