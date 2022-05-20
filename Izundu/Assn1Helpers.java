import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

class Assn1Helpers<T> {

    //Java Program to find average of an int Array.
    int Average(int[] Arr){
        int sum = 0;
        for (int j : Arr) {
            sum += j;
        }

        return sum/Arr.length;
    }

    //Create a Java Program to Sort an Array of Numeric or String Data.
    void Sort(T[] Arr){
        Arrays.sort(Arr);
    }

    //Write a Java Program to check if see if Array contains a specific value.
    boolean Find(T[] Arr, T value ){
        boolean ret = false;

        for (T val:Arr) {
            if(val.equals(value)) ret = true;
        }

        return ret;
    }

    //Write a Java Program to reverse the array contents.
    void Reverse(T[] Arr){
        Collections.reverse(Arrays.asList(Arr));
    }

    //Write a Java Program to remove a particular element from an array.
    boolean Remove(T[] Arr, T value){
        if(Find(Arr,value)){
            for (int i = 0; i < Arr.length; i++) {
                if(Arr[i].equals(value)){
                    Arr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    //Write a Java Program to find the second highest value in a numeric array.
    int SecondHighest(int[]Arr){
        Arrays.sort(Arr);
        return Arr[Arr.length-2];
    }

    //Create a Java code to copy an Array into another array.
    Object[] Copy(T[]Arr1, T[]Arr2){
        return Stream.concat(Arrays.stream(Arr1), Arrays.stream(Arr2))
                .toArray(size -> (T[]) Array.newInstance(Arr1.getClass().getComponentType(), size));

    }

    //Write a Java Code a Array of length 100 and fill it with Random int Values for testing purpose.
    int[] Random100(){
        int[] arr = new int[100];
        int bound = 100;
        Random rand = new Random(); //instance of random class
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(bound);
        }
        
        return arr;
    }

    //Java program to find duplicate elements in a String array.
    void DuplicateChars(String[] Arr){
        HashMap<String, Integer> charlist = new HashMap<String, Integer>();
        for (int i = 0; i < Arr.length; i++) {
            int count = 0;
            if(!charlist.containsKey(Arr[i])){
                for (int j = 0; j < Arr.length; j++) {
                    if(i != j && Arr[i].equals(Arr[j])){
                        count++;
                    }
                }
                charlist.put(Arr[i], count);
            }
        }
        charlist.forEach((k,v) -> System.out.println(k + " has " + v + " duplicates"));
        
    }

    //Write a Java program to check if two arrays are equal.
    boolean EqualArrays(T[] Arr1, T[]Arr2){
        if(Arr1.length != Arr2.length) return false;
        else{
            Arrays.sort(Arr1);
            Arrays.sort(Arr2);

            for (int i = 0; i < Arr1.length; i++) {
                if(!Arr1[i].equals(Arr2[i])) return false;
            }

            return true;
        }

    }

    void CheckPassFail(int x){
        if(x >= 50){
            System.out.println("PASS");
        }
        else  System.out.println("FAIL");

        System.out.println("DONE");
    }

    void CheckOddEven(int x){
        if(x % 2 ==0){
            System.out.println("Even Number");
        }
        else  System.out.println("Odd Number");

        System.out.println("bye");
    }

    void PrintNumberInWOrd(int x){
        switch (x){
            case 1:  System.out.println("ONE");
                break;
            case 2:  System.out.println("TWO");
                break;
            case 3:  System.out.println("THREE");
                break;
            case 4:  System.out.println("FOUR");
                break;
            case 5:  System.out.println("FIVE");
                break;
            case 6:  System.out.println("SIX");
                break;
            case 7:  System.out.println("SEVEN");
                break;
            case 8:  System.out.println("EIGHT");
                break;
            case 9:  System.out.println("NINE");
                break;
            default: System.out.println("OTHER");
                break;
        }
    }
    void PrintDayInWOrd(int x){
        if(x == 0) System.out.println("Sunday");
        else if (x == 1) System.out.println("Monday");
        else if (x == 2) System.out.println("Tuesday");
        else if (x == 3) System.out.println("Wednesday");
        else if (x == 4) System.out.println("Thursday");
        else if (x == 5) System.out.println("Friday");
        else if (x == 6) System.out.println("Saturday");
        else  System.out.println("");

    }

    void SumAverageRunningInt(int n){
        int sum = 0;
        int average = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        average = sum/n;

        System.out.println("The sum of 1 to " + n + "is " + sum);
        System.out.println("The average is " + average);

    }

    void Product1toN(int n){
        int prod = 1;
        int average = 0;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }

        System.out.println("The product of 1 to " + n + "is " + prod);

    }

    void Add2Integers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int num1 = scan.nextInt();
        System.out.println("Enter second integer:");
        int num2 = scan.nextInt();

        System.out.println("The sum is:" + (num1 + num2));
        scan.close();
    }

    void Swap2Integers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int num1 = scan.nextInt();
        System.out.println("Enter second integer:");
        int num2 = scan.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After the swap, first is " + num1 + ", second is "+ num2);
        scan.close();
    }
}
