package week1;

public class Question9 {

	public static void main(String[] args) {
		// Java program to find duplicate elements in an String array.
		
		String[] str= {"tree","home","dog","car","bus","home","cat","dog","home"};
		duplicateElements(str);
	}
	public static void duplicateElements(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if ((arr[i].equals(arr[j])) && (i!=j)) {
				
					System.out.println("The name -"+ arr[j] +"- is a duplicate ");
				}
			}
		}
		
		
		
	}

}
