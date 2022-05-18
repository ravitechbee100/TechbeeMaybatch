package week1javaeasicexecices;

import java.util.Scanner;

public class CountVowelDegits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String string=sc.next();
		
		count(string);
	}
	public static void count(String str) {
		int countVowel=0;
		int countDegit=0;
		int n=str.length();
		
		for (int j = 0; j < n; j++) {
			char ch=str.charAt(j);
			if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
				ch=Character.toLowerCase(ch);
				countVowel++;
				
				
			}else if (ch>='0' && ch<='9') {
				countDegit++;
				
			}
			
			
		}
		double percentageVowels=countVowel*100/n;
		double percentageDegit=countDegit*100/n;
		
		System.out.println("Number of vowels :"+countVowel+" ("+percentageVowels+"%)"
				+ ""+"\nNumber of degits :"+countDegit+" ("+percentageDegit+"%)");
		
		} 

	 
 
}
