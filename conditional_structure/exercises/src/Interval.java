import java.util.Scanner;

class Interval {
    Double number = null;

    public void betweenInterval() {
        enterDataOfInput();

        if(this.number >= 0 && this.number <= 25) {
            System.out.println("\nInterval in [0,25]");
        } else if(this.number >= 25 && this.number <= 50) {
            System.out.println("\nInterval in [25,50]");
        } else if(this.number >= 50 && this.number <= 75) {
            System.out.println("\nInterval in [50,75]");
        } else if(this.number >= 75 && this.number <= 100) {
            System.out.println("\nInterval in [75,100]");
        } else {
            System.out.println("\nOut of interval!");
        }
    }

    public void enterDataOfInput() {
        Scanner scanner = new Scanner(System.in);

        verifyDataOfInput(scanner, "Enter with value to interval: ");
    }

    public void verifyDataOfInput(Scanner scanner, String message) {
        while(this.number == null) {
            try{
                System.out.print(message);
                this.number = scanner.nextDouble();
            }catch(Exception e) {
                System.out.print("Error: Please, enter some value valid!");
                scanner.nextLine();
            }
        }
    }
}
