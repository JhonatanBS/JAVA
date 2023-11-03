import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Enter with a number:");
        number = in.nextInt();

        System.out.println("Odd:\n");

        Odd odd = new Odd(number);

        odd.showOdd();
    }
}