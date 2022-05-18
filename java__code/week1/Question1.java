package week1;

public class Question1 {
//	Java Program to find average of an int Array.
	public static void main(String[] args) {
		int a[] = { 5,4,5,6 };
		System.out.println("The average of the array is :" + averageOfArray(a));
		int arr[] = {2,4,5,4,5};
        int n = arr.length;
      
        System.out.println(avg(arr, n));

	}

	public static double averageOfArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}
	
	
	//optimal program
	public static double avgRecursive(int a[],int i,int n) {
		if(i==a.length-1) return a[i];
		if(i==0) return ((a[i]+avgRecursive(a,i+1,n))/n);
		return (a[i]+avgRecursive(a,i+1,n));
	}
	public static double avg(int a[],int n) {
		return avgRecursive(a, 0, n);
		
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	


