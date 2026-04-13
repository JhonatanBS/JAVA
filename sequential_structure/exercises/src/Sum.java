import java.util.Scanner;

public class Sum {
    int x;
    int y;

    public int sumTwoNumbers() {
        AllNumbers();
        return x + y;
    }

    public void AllNumbers() {
        Scanner scanner = new Scanner(System.in);

        this.x = enterNumbers(scanner, "Enter with primary value:\n");
        this.y = enterNumbers(scanner, "Enter with second value:\n");

    }

    public Integer enterNumbers(Scanner scanner, String message) {
        Integer value = null;

        while (value == null) {
            try {
                System.out.print(message);
                value = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("\nError: Enter with value valid!\n");
                scanner.next();
            }
        }
        return value;
    }
}
