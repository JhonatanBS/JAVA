import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int note;
        String info;

        System.out.println("Type your note:");
        note = in.nextInt();

        info = note >= 5 ? "Approved" : "Disapproved";

        System.out.print("Your were " + info + " !");
    }
}