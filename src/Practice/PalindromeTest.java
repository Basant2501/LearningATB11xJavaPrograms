package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a String");
        Scanner sc= new Scanner(System.in);
        str= sc.nextLine();
        int strLen=str.length();
        char[] arr=new char[str.length()];
        for (int i=0;i<strLen;i++){
            arr[i]=str.charAt(strLen-1-i);

        }
        String rev= new String(arr);
        System.out.println(rev);

        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " is a Palindrome");
        }
        else {System.out.println(str + " is not a Palindrome");
        }
    }



}
