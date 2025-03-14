package ex_01_Java_Basic;

import java.util.Scanner;

public class RightTriangleStarPattern {
    /*
     *
     **
     ***
     ****
     *****
     */
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int lengthOfTriangle=sc.nextInt();
        for(int i=1; i<=lengthOfTriangle; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
