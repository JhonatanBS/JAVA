package entities;

import java.util.Scanner;

public class NumberNegative {
    Scanner in = new Scanner(System.in);
    private int number;

    public NumberNegative(int number) {
        this.number = number;
    }

    public int verifyNumber() {
        while(this.number < 0 || this.number > 10) {
            System.out.println("\nPlease enter values between 0 and 10:");
            this.number = in.nextInt();
        }

        return this.number;
    }

    public void numbersNegatives(int[] arrayNumber) {
        System.out.println("\nNumbers Negatives:\n");
        for(int i = 0; i < arrayNumber.length; i++) {
            if(arrayNumber[i] < 0) {
                System.out.println("\n" + arrayNumber[i]);
            }
        }
    }
}
