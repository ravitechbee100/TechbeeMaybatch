package week1javaeasicexecices;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "Too hot to hoot";
        if( CheckPalindromeSentence(str))
          System.out.println(" The Sentence is palindrome");
        else
          System.out.println("The Sentence is not" + " " +
                                         "palindrome");

	}
	public static boolean CheckPalindromeSentence(String str) {
		
		str=str.toLowerCase();
		for (int i = 0; i <= str.length()-1; i++) {
			
			if(! (str.charAt(0)>='a') && (str.charAt(0)<='z') ) {// check if there is a special character behind the sentence
				continue;
			}
			else if (! (str.charAt(str.length()-1)>='a') && (str.charAt(str.length()-1)<='z') ) {// check if there is a special character afterthe sentence
				continue;
			}else if (str.charAt(0)== str.charAt(str.length()-1)) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
		
		
	}

}
