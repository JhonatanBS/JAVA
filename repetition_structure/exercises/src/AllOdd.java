import java.util.Scanner;

public class AllOdd {
    Integer value = null;

    public void Odd() {
        Scanner scanner = new Scanner(System.in);

        verifyDataInput(scanner, "Enter with value between 1 and 1000:");

        System.out.println("\n-----------------Odd Numbers-----------------\n");

        for (int i = 1; i < this.value; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    public void verifyDataInput(Scanner scanner, String message) {
        while (value == null || value < 1 || value > 1000) {
            try {
                System.out.println();
                System.out.print(message);
                this.value = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("\nError: Enter with value valid!");
                scanner.nextLine(); // Cleaning input
            }
        }
    }
}
