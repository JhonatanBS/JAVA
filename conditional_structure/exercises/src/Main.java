import java.util.Scanner;

public class Main {
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

        //MultipleOfNumbers multipleOfNumbers = new MultipleOfNumbers();

        //System.out.println(multipleOfNumbers.multipleTwoNumbers());

		/*
		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */

        //HourOfGame hourOfGame = new HourOfGame();

        //System.out.printf("\nThe game lasted %d hours", hourOfGame.calculateHourOfGame());

        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste ‘item’. A
        seguir, calcule e mostre o valor da conta a pagar.
         */

        //MarketListProcessor marketListProcessor = new MarketListProcessor();

        //System.out.printf("\nTotal: R$ %.2f", marketListProcessor.calculateProduct());

        /*
		Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		*/

        Interval interval = new Interval();

        interval.betweenInterval();
    }
}
