package ex_01_Java_Basic;
import java.util.*;
public class LeapYearChecker {
    public static void main(String[] args){
        System.out.println("LeapYearChecker: Enter a Year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if (year%400==0){
            System.out.println(year+" is a Leap Year");
        }
        else if (year%4==0 && year%100!=0){
            System.out.println(year+" is a Leap Year");
        }
        else {
            System.out.println(year+" is not a Leap Year");
        }
        sc.close();
    }

}
