package ex_01_Java_Basic;
import java.util.Scanner;

public class GradeCalculator {
     public char gradeDeterminer(int marksObtained){
        if (marksObtained>=0 && marksObtained<=100){
            if(marksObtained>=90){
                return 'A';
            } else if (marksObtained>=80) {
                return 'B';
            }
            else if (marksObtained>=70) {
                return 'C';
            }
            else if (marksObtained>=60 ) {
                return 'D';
            }
            else return 'F';

        }
        else return 'O';
    }
    public static void main(String[]args){
        System.out.println("Enter Marks");
        Scanner sc= new Scanner(System.in);
        int Marks=sc.nextInt();
        GradeCalculator gc=new GradeCalculator();
        sc.close();
        char Grade=gc.gradeDeterminer(Marks);
        if (Grade=='O'){
            System.out.println("MarksOutOfBoundException");
        }
        else {
            System.out.println("Grade Obtained:"+Grade);
        }
    }

}
