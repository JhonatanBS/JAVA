import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("What is Name?");
        Student.name = in.nextLine();

        System.out.println("Enter all notes:");
        Student.noteOne = in.nextDouble();
        Student.noteTwo = in.nextDouble();
        Student.noteThree = in.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", Student.someNotes());
        if(Student.someNotes() >= 60.00) {
            System.out.println(Student.verifyFinalGrade());
        }else{
            System.out.println(Student.verifyFinalGrade());
            System.out.printf("MISSING %.2f POINTS", 60.00 - Student.someNotes());
        }


    }
}