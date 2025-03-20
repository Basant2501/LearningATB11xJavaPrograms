package ex_01_Java_Basic;
import java.util.*;
public class PrimeNoCheck {
    public static void main(String [] args){
        System.out.println("Enter an integer");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(), count=0;
        if (num<2){
            System.out.println(num+" is neither prime nor a composite number");
        }
        else{
        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==0){
            System.out.println(num+" is a prime number");
        }
        else System.out.println(num+" is a composite number");
        }
        sc.close();
    }
}
