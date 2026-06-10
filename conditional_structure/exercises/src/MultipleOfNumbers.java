import java.util.Scanner;

class MultipleOfNumbers {
    Integer A = null;
    Integer B = null;

    public String multipleTwoNumbers() {
        enterValueOfData();

        return this.A % this.B == 0 || this.B % this.A == 0
                ?
                "\nThe numbers " + this.A + " and " + this.B + " " +"are multiples"
                :
                "\nThe numbers " + this.A + " and " + this.B + " " +"aren't multiples";
    }

    public void enterValueOfData() {
        Scanner scanner = new Scanner(System.in);

        verifyInputOfData(scanner, "Enter with value of A: ", "\nEnter with value of B: ");
    }

    public void verifyInputOfData(Scanner scanner, String firstMessage, String secondMessage) {
        while (this.A == null || this.B == null) {
            try {
                System.out.print(firstMessage);
                this.A = scanner.nextInt();
                System.out.print(secondMessage);
                this.B = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Please, input value valid!");
                scanner.nextLine();
            }
        }
    }
}
