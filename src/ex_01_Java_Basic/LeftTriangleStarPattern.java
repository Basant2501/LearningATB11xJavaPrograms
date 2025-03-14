package ex_01_Java_Basic;

import java.util.Scanner;

public class LeftTriangleStarPattern {
    /*
     *****
     ****
     ***
     **
     *
     */
    public static void main(String[] args){
        System.out.println("Enter the no. of rows for the triangle: ");
        Scanner sc=new Scanner(System.in);
        int lengthOfTriangle=sc.nextInt();
        for (int i=lengthOfTriangle;i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
