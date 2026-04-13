import java.util.Scanner;

public class FourValues {

    int A;
    int B;
    int C;
    int D;

    public int calculateFourValues() {
        enterFourValues();
        return (A * B) - (C * D);
    }

    public void enterFourValues() {
        Scanner scanner = new Scanner(System.in);

        this.A = verifyNumbersEntered(scanner, "Enter with value of A: \n");
        this.B = verifyNumbersEntered(scanner, "Enter with value of B: \n");
        this.C = verifyNumbersEntered(scanner, "Enter with value of C: \n");
        this.D = verifyNumbersEntered(scanner, "Enter with value of D: \n");
    }

    public int verifyNumbersEntered(Scanner scanner, String message) {
        Integer value = null;

        while (value == null) {
            try {
                System.out.print(message);
                value = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("\nPlease, enter with value valid!\n");
                scanner.next(); // Clean the  value
            }
        }
        return value;
    }
}
