package ex_01_Java_Basic;

import java.util.Scanner;

public class BufferIssue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads integer but leaves "\n" in buffer

        scanner.nextLine(); // ✅ Clear the buffer

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // ✅ Now reads the full name properly

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);

        scanner.close();
    }
}
