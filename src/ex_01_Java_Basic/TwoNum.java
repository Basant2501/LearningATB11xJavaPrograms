package ex_01_Java_Basic;

import java.util.Scanner;

public class TwoNum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 12};
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target");
        target = sc.nextInt();
        int arrLen = arr.length;
        int compliment;
        boolean found = false;
        for (int i = 0; i < arrLen; i++) {
            compliment = target - arr[i];
            for (int j = i + 1; j < arrLen; j++) {
                if (compliment == arr[j]) {
                    System.out.println("The Two Num Solution are:" + arr[i] + "&" + arr[j]);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found)
            System.out.println("No Two Sum Solution");
        sc.close();
    }

}