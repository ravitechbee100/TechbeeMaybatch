package Mamo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mamo {
	
	public static void TestPalindromicWord() {
		
		System.out.println("Enter Any String");
		Scanner s = new Scanner(System.in);
		
		String origin = s.nextLine();
		int length = origin.length();
		
		boolean isPalindrome = true;
		
		for(int startIndex = 0; startIndex < length; startIndex++) 
		{
			if(origin.charAt(startIndex) != origin.charAt(length- 1 - startIndex)) {
				
				System.out.print("String is not palindrome");
				isPalindrome = false;
				break;
			}
			
		}
		if(isPalindrome) {
			System.out.print("String is palindrome");

		}
		
		s.close();
		
		
		
	}
	
	
	public static int[] removeElement(int[] arrayRemovable, int index) {
		
		 if(arrayRemovable == null || index < 0  || index >= arrayRemovable.length ) {
			 
	    	 return arrayRemovable;
	     }
		 
	        // Create ArrayList from the array
		 
		 List<Integer> arrayList = IntStream.of(arrayRemovable).boxed().collect(Collectors.toList());
		 
		 arrayList.remove(index)
;
//		 int [] anotherArray = new int[arrayRemovable.length -1];
//		
//		for(int i = 0, k = 0; arrayRemovable.length; i++) {
//			
//			if(i == index) {    
//				continue;
//			}
//			anotherArray[k++] = arrayRemovable[i];
//		}
		 
		return arrayList.stream().mapToInt(Integer:: intValue).toArray();
	}
	
	
	public static void main(String[] args) {
		
		
		//Java Program to find average of an int Array.  
		
		    TestPalindromicWord();
		    
		    System.out.println("***************");
		
		
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
	     
	     
	     // Get the array
	        int[] arr = { 1, 2, 3, 4, 5 };
	 
	        // Print the resultant array
	        System.out.println("Original Array: "
	                           + Arrays.toString(arr));
	 
	        // Get the specific index
	        int index = 2;
	 
	        // Print the index
	        System.out.println("Index to be removed: " + index);
	 
	        // Remove the element
	        arr = removeElement(arr, index);
	 
	        // Print the resultant array
	        System.out.println("Resultant Array: "
	                           + Arrays.toString(arr));
	    
	     
  
	     
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

       //called TestPalindromicWord,
	    
	    
	    
	}

}
