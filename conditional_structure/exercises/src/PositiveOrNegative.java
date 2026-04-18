import java.util.Scanner;

public class PositiveOrNegative {
    Integer value = null;
    
    public Integer getValue(){
        enterValueOfData();
        return this.value;
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