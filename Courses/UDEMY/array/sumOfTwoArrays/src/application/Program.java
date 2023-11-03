package application;

import entities.SumOfTwoArrays;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SumOfTwoArrays sumOfTwoArrays = new SumOfTwoArrays();

        Integer[] arrayA, arrayB, arrayC;
        int quantity,i;

        System.out.println("How many values will each vector have ?");
        quantity = in.nextInt();

        arrayA = new Integer[quantity];
        arrayB = new Integer[quantity];
        arrayC = new Integer[quantity];

        for(i = 0; i < arrayA.length; i++) {
            System.out.println("Input the values of array A");
            arrayA[i] = in.nextInt();
        }

        for(i = 0; i < arrayB.length; i++) {
            System.out.println("Input the values of array B");
            arrayB[i] = in.nextInt();
        }

        sumOfTwoArrays.arrayA = arrayA;
        sumOfTwoArrays.arrayB = arrayB;
        sumOfTwoArrays.arrayC = sumOfTwoArrays.sumOFTwoArrays(quantity);
        arrayC = sumOfTwoArrays.arrayC;

        System.out.println(arrayC);

        System.out.println("Array Resulting:");
        for( Integer array : arrayC) {
            System.out.println(array);
        }
    }
}
