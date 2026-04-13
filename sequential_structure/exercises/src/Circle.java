import java.util.Scanner;

public class Circle {
    public static final double PI = 3.14159;
    double radius;

    public double calculateArea() {
        enterRadius();
        return PI * (radius * radius);
    }

    public void enterRadius() {
        Scanner scanner = new Scanner(System.in);

        this.radius = verifyNumberEntered(scanner, "Enter with value of radius: \n");
    }

    public double verifyNumberEntered(Scanner scanner, String message) {
        Double value = null;

        while (value == null) {
            try {
                System.out.print(message);
                value = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("\nPlease, enter with value valid!\n");
                scanner.next(); // Clean the  value
            }
        }
        return value;
    }
}
