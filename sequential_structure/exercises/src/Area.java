import java.util.Scanner;

public class Area {
    private double A;
    private double B;
    private double C;

    public Area() {
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public void enterDataArea() {
        Scanner scanner = new Scanner(System.in);

        this.A = verifyInputOfData(scanner, "Enter with value of A from Area: ");
        this.B = verifyInputOfData(scanner, "\nEnter with value of B from Area: ");
        this.C = verifyInputOfData(scanner, "\nEnter with value of C from Area: ");
    }

    public double verifyInputOfData(Scanner scanner, String message) {
        Double value = null;

        while (value == null) {
            try {
                System.out.print(message);
                value = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Error: Enter with value valid!");
                scanner.next();
            }
        }
        return value;
    }
}
