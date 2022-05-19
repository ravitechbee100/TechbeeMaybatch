package week1;

public class Question3 {
	
	
	 
	public static void main(String[] args) {
		// Write a Java Program to check if see if Array contains a specific value. 
		int[] a= {2,4,5,6,9,33};
		String [] b= {"Tree","Albert","Car","Bus"};
		isFoundInt(a, 33);
		isFoundString(b, "Car");
	}
	public static boolean isFoundInt(int arr[],int value) {
		boolean exist=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value) {
				exist=true;
				break;
				}
			}
		if (exist) {
			System.out.println("The value "+ value+" exist in the array");
		}else {
			System.out.println("The value "+ value+" does not exist in the array");
		}
		return exist;
		}
	
	
	public static boolean isFoundString(String[]str, String string) {
		
		boolean exist=false;
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals(string)) {
				exist=true;
				break;
				}
			}
		if (exist) {
			System.out.println("The \""+ string+"\" name exist in the array");
		}else {
			System.out.println("The \" "+ string+"\" name does not exist in the array");
		}
		return exist;
		}
		
	
	
	
	
	
	}

	
