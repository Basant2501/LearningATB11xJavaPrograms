package Practice;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println("Input a String");
        Scanner sc= new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int len=str.length();
        char[] arr=new char[len];
        for(int i=len-1;i>=0;i--){
            arr[len-1-i]=str.charAt(i);
        }
        String rev=new String(arr);
        System.out.println("Reverse of I/p String is: "+ rev);
    }
}

