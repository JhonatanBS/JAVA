import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double a;
        Double b;
        Double c;

        System.out.println("What is value for a ?");
        a = in.nextDouble();

        System.out.println("What is value for b ?");
        b = in.nextDouble();

        System.out.println("What is value for c ?");
        c = in.nextDouble();

        Bhaskara bhaskara = new Bhaskara(a,b,c);

        bhaskara.equationBhaskara();
    }
}
