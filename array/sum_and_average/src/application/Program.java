package application;

import entities.SumAndAverage;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quantityNumbers,i;
        double[] arrayNumbers;
        double sum;
        SumAndAverage sumAndAverage;

        System.out.println("How many numbers will you enter?");
        quantityNumbers = in.nextInt();

        arrayNumbers = new double[quantityNumbers];

        for(i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Enter a number:");
            arrayNumbers[i] = in.nextDouble();
        }

        sumAndAverage = new SumAndAverage(arrayNumbers);

        sum = sumAndAverage.Sum();

        System.out.print("VALUES = ");
        sumAndAverage.showPositionValues();
        System.out.printf("\nSUM = %.2f", sum);
        System.out.printf("\nAVERAGE = %.2f", sumAndAverage.Average(sum));
    }
}
