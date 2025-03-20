package ex_01_Java_Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String [] args){
        System.out.println("Enter the no. of terms in Fibonacci seq to display");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // Handle cases where n is invalid
        if(n<=0) {
            System.out.println("Please enter a positive integer value");
            sc.close();
            return;
        }

        int [] f= new int[n];// Initialize array
        // Handle n = 1 separately
        f[0]=0;
        if(n>=2) f[1]=1;
        if (n>2)
            for (int i=2; i<n; i++){
           f[i]=f[i-1]+f[i-2];
        }
        for (int i=0; i<n; i++){
                if(i<n-1) {
                    System.out.print(f[i] + ", ");
                }
                else {
                    System.out.print(f[i]+" ..");
                }
            }
            sc.close();
    }

}
