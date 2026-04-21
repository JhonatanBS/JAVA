import java.util.Scanner;

public class EvenOrOdd {
    Integer value = null;
    
    public String calculateEvenOrOdd() {
        enterValueOfData();
        return this.value % 2 == 0 ? "\nThis number %d is Even" : "\nThis number %d is Odd";
    }
    
    public void enterValueOfData() {
        Scanner scanner = new Scanner(System.in);
        verifyInputOfData(scanner, "Enter with value: ");
    }
    
    public void verifyInputOfData(Scanner scanner, String message) {
        
        while(this.value == null) {
            try{
                 System.out.print(message);
                 this.value = scanner.nextInt();
            }catch(Exception e) {
                System.out.println("Error: Enter with value valid!");
                scanner.nextLine();
            }
        }
    }
}