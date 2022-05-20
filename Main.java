import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

    static void PrintArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int len = scan.nextInt();
        int [] arr = new int[len];
        System.out.println("Enter all items: ");
        for(int i=0;i<len;i++){//for reading array
            arr[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        scan.close();
    }

    static void ReverseString(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Reverse is: ");

        for(int i=str.length();i>=0;i--){//for reading array
            System.out.print(str.charAt(i));
        }

        scan.close();
    }

    static void CountVowelsDigits(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        int vow = 0;
        double percent = vow/str.length() * 100;


        for(int i=str.length();i>=0;i--){//for reading array
            String c = String.valueOf(str.charAt(i));
            if(c.toLowerCase().equals("a") ||c.toLowerCase().equals("e") ||c.toLowerCase().equals("i")||c.toLowerCase().equals("o")||c.toLowerCase().equals("u") ){
                vow++;
            }
        }
        System.out.println("Num of vowels is "+ vow +percent);
        System.out.println("Num of digits is "+ str.length() + (100 - percent));
        scan.close();
    }

    static void TestPalindromicWord(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        StringBuffer sbr = new StringBuffer(str);

        sbr.reverse();
        if(sbr.equals(str)){
            System.out.println(str + "is a palindrome");
        }
        else System.out.println(str + "is not a palindrome");

        scan.close();
    }

}