package ex_02_Array;
import java.util.*;
public class SecondLargestNumber {
    public static void main(String[] args){
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if (size<2)
        {System.out.println("Array must have at least two elements");
        return;
        }
        int[] arr= new int[size];
        //Taking Array Input
        for (int i=0; i<size; i++){
            System.out.println("Enter arr["+i+"]");
            arr[i]= sc.nextInt();
        }
        //Display Array Elements
        System.out.print("arr[]= arr[");
        for (int j=0; j<size; j++){
            System.out.print(arr[j]+(j==size-1?"]":", "));
        }
        System.out.println();

        int max=arr[0],  s_max=arr[0];
        for(int k=1; k<size; k++){
            if(arr[k]>max){
                s_max=max;
                max=arr[k];
            } else if (k==1 && arr[k]<max)
                {
                    s_max=arr[k];
                }
                else if (arr[k]>s_max && arr[k]<max)  {
                s_max=arr[k];}
            }

        if( s_max==max){
            System.out.println("No second largest number found (all elements may be equal).");
        }
        else {
        System.out.println("Largest no. in arr[] is: "+ max);
        System.out.println("Second Largest no. in arr[] is: "+ s_max);
        }
        sc.close();
    }
}

