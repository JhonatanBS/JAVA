import java.util.Random;
import java.util.Scanner;

class Employee {
    String register;
    double valueOfHour;
    double workedHours;

    public double getValueOfHour() {
        return this.valueOfHour;
    }

    public double getWorkedHours() {
        return this.workedHours;
    }

    public String getRegister() {
        return this.register;
    }

    public double calculateSalary() {
        return valueOfHour * workedHours;
    }

    public void registerofEmployee() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        int value;

        for(int i = 0; i < 3; i++) {
            value = random.nextInt(10);
            stringBuilder.append(value);
        }

        this.register = stringBuilder.toString();
    }

    public void enterInputData() {
        Scanner scanner = new Scanner(System.in);
        registerofEmployee();

        this.workedHours = verifyInputData(scanner, "Enter the value of worked hours:");
        this.valueOfHour = verifyInputData(scanner, "Enter the value of hour from employee:");
    }

    public double verifyInputData(Scanner scanner, String message) {
        Double value = null;

        while(value == null) {
            try{
                System.out.println(message);
                value = scanner.nextDouble();
            }catch(Exception e) {
                System.out.println("Please, enter with value valid!");
                scanner.next();
            }
        }
        return value;
    }
}
