public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
        com uma mensagem explicativa, conforme exemplos.
        */

        //Sum sum = new Sum();
        //System.out.printf("SUM: %d", sum.sumTwoNumbers());

        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor
        da área deste círculo com quatro casas decimais conforme exemplos.
        Fórmula da área: area = π * raio2
        Considere o valor de π = 3,14159
         */

        Circle circle = new Circle();
        System.out.printf("\nAREA: %.2f", circle.calculateArea());
    }
}