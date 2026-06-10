import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		  Fazer um programa para ler um número inteiro, e 
		  depois dizer se este número é negativo ou não.
		*/
		
		//PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
		//int value = positiveOrNegative.getValue();
		
		//System.out.println(value < 0 ? "\nThe value is negative!" : "\nThe value is positive!");
		
		//EvenOrOdd evenOrOdd = new EvenOrOdd();
		
		//System.out.printf(evenOrOdd.calculateEvenOrOdd(), evenOrOdd.value);

		/*
		Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são
        Múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente.
		* */

		MultipleOfNumbers multipleOfNumbers = new MultipleOfNumbers();

		System.out.println(multipleOfNumbers.multipleTwoNumbers());
	}
}
