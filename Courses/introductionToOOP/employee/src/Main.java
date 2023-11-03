import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        double percentage;

        System.out.println("Name: ");
        employee.name = in.nextLine();

        System.out.println("Gross salary: ");
        employee.grossSalary = in.nextDouble();

        System.out.println("Tax: ");
        employee.tax = in.nextDouble();

        System.out.printf("Employee: %s, $ %.2f", employee.name, employee.netSalary());

        System.out.println("\nWith percentage to increase salary?");
        percentage = in.nextDouble();

        System.out.printf("Update data: %s, $ %.2f",employee.name, employee.increaseSalary(percentage));
    }
}