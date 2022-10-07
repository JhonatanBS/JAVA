import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Table\n");

        System.out.println("Enter a number for the table:");
        number = in.nextInt();

        Table table = new Table(number);

        table.choiceTable();
    }
}