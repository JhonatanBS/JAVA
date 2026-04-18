import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		  Fazer um programa para ler um número inteiro, e 
		  depois dizer se este número é negativo ou não.
		*/
		
		PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
		int value = positiveOrNegative.getValue();
		
		System.out.println(value < 0 ? "\nThe value is negative!" : "\nThe value is positive!");
	}
}
