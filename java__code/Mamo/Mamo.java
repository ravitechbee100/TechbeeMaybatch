package Mamo;

import java.util.Arrays;

public class Mamo {
	
	
	
	public static void main(String[] args) {
		
		
		//Java Program to find average of an int Array.  
		
		
		   int [] array = {23, 34, 65, 76, 89, 76, 54, 23};
		   int length = array.length;
		   int sum = 0;
		   
		   for(int i = 0; i<array.length; i++) {
			   
			   sum += array[i];
		   }
		   double average = sum / length;
	    System.out.println("average:" +average);
	    
	   //    Create a Java Program to Sort an Array of Numeric or String Data.

	    
	    int [] originalArray = { 5,4,9,3,2,1};
	    String [] originalString = { "obi", "Mamo", "izundu","amir"};
	    
	    System.out.println("original Array Value: " + Arrays.toString(originalArray));
	     Arrays.sort(originalArray);
	     System.out.println("original Array Value: " + Arrays.toString(originalArray));

	     System.out.println("original String array Value: " + Arrays.toString(originalString));
	     Arrays.sort(originalString);
	     System.out.println("original String array Value: " + Arrays.toString(originalString));
	    
	    // Write a Java Program to check if see if Array contains a specific value. 

	     
	     int [] numberarray = {1,2,3,4,5};
	     int tofound = 8;
	     boolean found = false;
	     
	     for (int i: numberarray ) {
	     if (i == tofound) {
	    	 found  =  true;
	    	 break;
	    	 	 
	     }
	     }
	     
	     if(found) 
	    	 System.out.println( tofound +  " is the number  found");
	    	 else
	        System.out.println( tofound +  " is the number not found");
		 
	        
	     
	     
	     
	    // Write a Java Program to reverse the array contents. 
	     
	     int [] arrayOri =  {4,6,9,9,0};
	     
	     System.out.println("original Array");
	     
	     for(int i = 0; i < arrayOri.length; i++) {
	    	 System.out.println(arrayOri[i] + " ");
	     }
	      System.out.println();
	      
	     System.out.println("reverse Array");
	     
	     for(int i = arrayOri.length - 1; i>=0; i--) {
	    	 System.out.println(arrayOri[i]);
	    	 
	    	 
	    	 

	     }
	     //Write a Java Program to remove a particular element from an array. 
	     
	     int [] arrayRemovable; int  index;
	     
	     //if()
	     
	     
	     
	     
	     
	     
	     
//	     2. Write a program called CountVowelsDigits, which prompts the user for a String, counts the number of
//	     vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints the counts and the
//	     percentages (rounded to 2 decimal places). 


		int vowels = 0, consonant = 0, speecialChar = 0, digit = 0; 
		
		String str = "Mamo34**!"; 
		
		for(int i = 0; i < str.length(); i++) {
			
			 char cha = str.charAt(i);
			 if( (cha >= 'a' && cha <='z') ||
					 (cha >= 'A' && cha <= 'Z') ) 
			 {
				cha = Character.toLowerCase(cha);
				
				if(cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u')
					vowels ++;
				else
					consonant ++;
				
				 
			 }
			 else if( cha >= '0' && cha <= '9')
				 digit++;
			 else
				 speecialChar++;
			 
			
		}
		
	    System.out.println("Vowels count: " + vowels);
	    System.out.println("digit count: " + digit);
	    System.out.println("consonant count: " + consonant);
	    System.out.println("special Charactor count: " +speecialChar);


	}

}
