package week1;

public class Question10 {

	public static void main(String[] args) {
		// Write a Java program to check if two arrays are equal.
		int[]a= {1,2,3,4,5,6};
		int[] b= {1,2,3,4,5};	
		System.out.println(ArraysEquality(a, b));
	}
	public static boolean ArraysEquality(int arr[],int [] arr2) {
		boolean flag =true;
		if (arr.length == arr2.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] !=arr2[i]) {
					return !flag;
				}
			}
			
		}else {
			return !flag;
		}
		return flag;
		
		

}
}
