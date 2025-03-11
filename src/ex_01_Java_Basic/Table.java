package ex_01_Java_Basic;


import java.util.Scanner;

public class Table{
    public static void main(String[] args){
        System.out.println("Which integer number multiplication table you want to see?");
        Scanner sc=new Scanner(System.in);
        int int_value=sc.nextInt();
        System.out.println("Table of "+ int_value);
        for(int i=1; i<=100; i++){
            System.out.println(int_value+"*"+i+"="+int_value*i);

        }
        sc.close();
    }

}
