import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;

        Menu menu = new Menu();

        menu.choiceMenu();

        System.out.println("\nChoose one of the options:");
        option = in.nextInt();

        switch (option) {
            case 0:
                System.out.println("0 - You Left");
                break;
            case 1:
                System.out.println("1 - You Started");
                break;
            case 2:
                System.out.println("2 - You Stopped");
                break;
            case 3:
                System.out.println("3 - You Advance");
                break;
            case 4:
                System.out.println("4 - You come back");
                break;
            default:
                System.out.println("Choice Invalid!");
        }
    }
}