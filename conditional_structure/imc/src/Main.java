import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Double height;
        Double weight;

        System.out.println("What's your height ?");
        height = in.nextDouble();

        System.out.println("What's your weight ?");
        weight = in.nextDouble();

        IMC imc = new IMC(height,weight);

        Double result = imc.calculateIMC();

        System.out.print("\nIMC: " + result + "\nCondition: ");

        if(result >= 30.00) {
            System.out.println("Obese");
        }else if(result >= 25 && result < 30.00) {
            System.out.println("Overweight");
        }else if(result >= 18.50 && result < 25.00) {
            System.out.println("Normal weight");
        }else {
            System.out.println("Under weight");
        }
    }
}