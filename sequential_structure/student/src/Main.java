import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter with the name from student: ");
        String name = scanner.next();

        Student student = new Student(name);

        System.out.printf("""
                \nName: %s
                Registration: %s
                Passed: %b
                \n""", student.getName(), student.getRegistration(), student.getPassed());

        Grade grade = new Grade();

        grade.enterAllGrade();

        if (grade.average() > 5.0) {
            System.out.println("Congratulations! You passed the exam. Great job!");
            student.setPassed(true);
        } else {
            System.out.println("We regret to inform you that you did not pass. Please keep trying, and you can do it.");
        }

        System.out.printf("""
                \nName: %s
                Registration: %s
                Passed: %b
                \n""", student.getName(), student.getRegistration(), student.getPassed());

        scanner.close();
    }
}
