package ex_01_Java_Basic;
import java.util.Scanner;

public class PyramidPattern {
    /*
      *
     ***
    *****
   *******
  *********

     */
    public static void main(String[]args){
        System.out.println("Enter the no. of rows in pyramid");
        Scanner sc=new Scanner(System.in);
        int rowCount=sc.nextInt();
        for(int i=1; i<=rowCount; i++){
            for (int j=rowCount-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}
