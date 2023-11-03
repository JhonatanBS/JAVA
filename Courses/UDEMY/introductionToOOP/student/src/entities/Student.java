package entities;

public class Student {
    public static String name;
    public static double noteOne;
    public static double noteTwo;
    public static double noteThree;

    public static double someNotes() {
        return noteOne + noteTwo + noteThree;
    }

    public static String verifyFinalGrade() {
        double finalGrade = someNotes();
        return finalGrade >= 60.00 ? "PASS" : "FAILED";
    }
}
