package week1javaeasicexecices;

public class Product1ToN {

	public static void main(String[] args) {
		int n =10;
		int prod=1;
		
		for (int i = 1; i <=n; i++) {
			prod=prod*i;
		}
		System.out.println(" The product of the numbers in range 1-10: "+prod);
		
	}

}
