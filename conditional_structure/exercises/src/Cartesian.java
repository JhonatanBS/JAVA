import java.util.Scanner;

class Cartesian {
    Double x = null;
    Double y = null;

    public void whatIsInterval() {
        enterDataOfInput();

        if(this.x > 0 && this.y > 0) {
            System.out.print("Q1");
        } else if(this.x > 0 && this.y < 0) {
            System.out.print("Q4");
        } else if(this.x < 0 && this.y > 0) {
            System.out.print("Q2");
        } else if(this.x < 0 && this.y < 0) {
            System.out.print("Q3");
        } else {
            System.out.print("Point Origin!");
        }
    }

    public void enterDataOfInput() {
        Scanner scanner = new Scanner(System.in);

        verifyDataOfInput(scanner, "Enter with value of X: ", "Enter with value of Y: ");
    }

    public void verifyDataOfInput(Scanner scanner, String messageOne, String messageTwo) {
        while(this.x == null || this.y == null) {
            try{
                System.out.print(messageOne);
                this.x = scanner.nextDouble();
                System.out.print(messageTwo);
                this.y = scanner.nextDouble();
            }catch(Exception e) {
                System.out.print("Error: Please, enter some value valid!");
                scanner.nextLine();
            }
        }
    }
}
