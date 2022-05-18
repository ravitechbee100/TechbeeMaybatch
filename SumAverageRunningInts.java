
public class SumAverageRunningInts {
	
	
public static void main(String[] args) {
		
		int sum = 0;
		double average = 0;
		int lowerBound  = 1;
		int  upperBound = 100;
		
		for(int number = lowerBound;  number  <=  upperBound; number++) {
		  sum +=  number;
		  average =  (sum / number);
		  

	     }
		System.out.println("the sum of 1 to 100 is " + sum);
		
		System.out.println("the average number from 1 to 100 is " + average);

	}

}
