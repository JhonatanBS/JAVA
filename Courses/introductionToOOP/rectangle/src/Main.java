import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double width, height;

        System.out.println("Enter rectangle width and height:");
        width = in.nextDouble();
        height = in.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.printf("AREA = %.2f\n" , rectangle.area());
        System.out.printf("PERIMETER = %.2f\n" , rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f" , rectangle.diagonal());
    }
}