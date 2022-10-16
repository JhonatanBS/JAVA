package application;

import entities.NumberNegative;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;
        int[] arrayNumbers;
        NumberNegative numberNegative;

        System.out.println("Enter values between 0 and 10:");

        numberNegative = new NumberNegative(in.nextInt());

        number = numberNegative.verifyNumber();

        arrayNumbers = new int[number];

        for(int i = 0; i < number; i++) {
            System.out.println("\nEnter a value:");
            arrayNumbers[i] = in.nextInt();
        }

        numberNegative.numbersNegatives(arrayNumbers);

    }
}
