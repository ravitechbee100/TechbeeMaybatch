import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringS {
	
	
	

	public static void main(String[] args) {
		
		String s1 = new String("Hello");    //String 1  
	    String s2 = new String(" World");    //String 2  
	    String s = String.format("%s%s",s1,s2);   //String 3 to store the result  
	      System.out.println(s.toString());   
	      
	      List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
	      String str = liststr.stream().collect(Collectors.joining(" , ")); //performs joining operation  
	          System.out.println(str.toString());  //Displays result  
		
		
		
	     String orinalString = "ABCDEFG" , reverseStrin = "";
	     char letter;
	     
	     
	     for(int i = 0; i < orinalString.length(); i++) {
	    	 letter = orinalString.charAt(i);
	    	 reverseStrin = letter + reverseStrin; 
	    	   
	    	 
	     }
	     
	     System.out.println(reverseStrin);
		
	}
	
	

}
