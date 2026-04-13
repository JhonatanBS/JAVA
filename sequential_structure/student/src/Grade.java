import java.util.Scanner;

public class Grade {
    private double gradePrimary;
    private double gradeSecond;
    private double gradeThird;


    public double readGrade(Scanner scanner, String message) {
        Double value = null;

        while (value == null) {
            try {
                System.out.println(message);
                value = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("\nInvalid value! Please enter a number: \n");
                scanner.next();
            }
        }
        return value;
    }

    public void enterAllGrade() {
        Scanner scanner = new Scanner(System.in);

        this.gradePrimary = readGrade(scanner, "Enter with primary grade from student: ");
        this.gradeSecond = readGrade(scanner, "\nEnter with second grade from student: ");
        this.gradeThird = readGrade(scanner, "\nEnter with third grade from student: ");

        scanner.close();
    }

    public double average() {
        return (this.gradePrimary + this.gradeSecond + this.gradeThird) / 3.0;
    }
}
