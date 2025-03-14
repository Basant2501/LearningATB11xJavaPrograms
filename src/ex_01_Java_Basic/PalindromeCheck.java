package ex_01_Java_Basic;
import java.util.*;

public class PalindromeCheck {
    public static void main (String [] args){
        System.out.println("Palindrome Checker:\nEnter a String-");
        Scanner sc=new Scanner(System.in);

        //Take a String input
        String stringInput=sc.nextLine();

        //Normalize the string: remove non-alphanumeric characters and convert to lowercase
        stringInput=stringInput.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        //Declare a reverse array variable
        char[] reverseArray=new char[stringInput.length()];

        //Efficient Way to reverse a string is through using StringBuilder
        //String reversedString = new StringBuilder(stringInput).reverse().toString();

        /*
        StringBuilder is a mutable sequence of characters.
        Unlike String, which is immutable,
        StringBuilder allows modifications (like reversal) without creating multiple objects in memory.
        Wrapping stringInput inside StringBuilder lets us use its built-in methods.
        */

        for(int i=stringInput.length()-1;i>=0;i--){
            reverseArray[stringInput.length()-1-i]=stringInput.charAt(i);

        }

        //The String class has a constructor that takes a char[] and creates a String from it.

        String reversedString= new String(reverseArray);
        if (stringInput.equals(reversedString)) {
            System.out.println("Input string is Palindrome");}
        else{
            System.out.println("Input string is not Palindrome");
            System.out.println("Input string:"+stringInput);
            System.out.println("Reverse string:"+reversedString);

        }
    }
}



/*Take a String input
Declare a reverse array variable
run a for loop which would pick char from input string and add it to reverse array */