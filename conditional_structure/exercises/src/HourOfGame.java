import java.util.Scanner;

public class HourOfGame {
    Integer start = null;
    Integer end = null;

    public int calculateHourOfGame() {
        enterValueOfData();

        return start < end ? (end - start) : ((24 - start) + end);
    }

    public void enterValueOfData() {
        Scanner scanner = new Scanner(System.in);

        verifyInputOfData(scanner, "Enter with start hour of game: ", "\nEnter with end hour of game: ");
    }

    public void verifyInputOfData(Scanner scanner, String firstMessage, String secondMessage) {
        while (this.start == null || this.end == null) {
            try {
                System.out.print(firstMessage);
                this.start = scanner.nextInt();
                System.out.print(secondMessage);
                this.end = scanner.nextInt();

                if (this.start < 0 || this.start > 24 || this.end < 0 || this.end > 24) {
                    this.start = null;
                    this.end = null;
                    System.out.println("\nPlease, enter with value 0 until 24\n");
                }
            } catch (Exception e) {
                System.out.println("Error: Please, input value valid with 0 until 24 hour!");
                scanner.nextLine();
            }
        }
    }

}
