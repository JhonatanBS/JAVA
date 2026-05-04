import java.util.Random;
import java.util.Scanner;

public class NumbersInAndOut {
    Integer value = null;

    public void whereOnAndIn() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        verifyDataInput(scanner, "Enter with value: ");

        int[] arrayNumbers = new int[this.value];

        System.out.println("\n-----------------IN and OUT-----------------\n");

        for (int i = 0; i < this.value; i++) {
            arrayNumbers[i] = random.nextInt(100);

            System.out.println(arrayNumbers[i] >= 10 && arrayNumbers[i] <= 20 ? (arrayNumbers[i] + " in") : (arrayNumbers[i] + " out"));
        }
    }

    public void verifyDataInput(Scanner scanner, String message) {
        while (value == null) {
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
