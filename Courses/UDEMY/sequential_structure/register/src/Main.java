import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner out = new Scanner(System.in);

        String name;
        String lastName;
        int age;
        char genre;
        String birthday = "1990/02/15";
        Double salary;

        System.out.println("What is your name?");
        name = out.nextLine();

        System.out.println("What is your last name?");
        lastName = out.nextLine();

        System.out.println("What is your age?");
        age = out.nextInt();

        out.nextLine();

        System.out.println("What is your genre?");
        genre = out.next().charAt(0);

        System.out.println("What is your salary");
        salary = out.nextDouble();

        out.nextLine();

        Locale.setDefault(Locale.US);

        System.out.print("***************REGISTER***************\n");
        System.out.printf("Name: %s %s \n" + "Age: %d \n" + "Genre: %s\n" + "Birthday: %s\n" + "Salary: %.2f", name, lastName, age, genre, birthday, salary);
        System.out.print("\n**************************************");
    }
}
