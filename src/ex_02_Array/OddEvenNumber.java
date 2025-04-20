package ex_02_Array;

public class OddEvenNumber {
    public static void main(String[] args) {
        int[] arr= {23,24,32,12};
        for (int i=0 ; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is an even no.");
            }
            else System.out.println(arr[i]+" is an odd no." );;
        }

    }

}
