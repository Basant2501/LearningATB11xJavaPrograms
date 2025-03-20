package ex_01_Java_Basic;
import java.util.*;

public class CountVowelAndConsonant {
    public static void main(String [] args){
        System.out.println("Enter a String Input");
        Scanner sc= new Scanner(System.in);
        String strInput=sc.nextLine();
        strInput=strInput.toLowerCase();
        char[] arr= strInput.toCharArray();
        int vCount=0, cCount=0;
        for(int i=0; i<=strInput.length()-1; i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                vCount++;
            }
            else if (arr[i] >'a' && arr[i] <'z'){
                cCount++;
            }
        }
        System.out.println("Vowel count:"+ vCount);
        System.out.println("Consonant count:"+ cCount);
        sc.close();
    }
}
