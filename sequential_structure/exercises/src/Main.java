import java.util.ArrayList;
import java.util.List;

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

        //Circle circle = new Circle();
        //System.out.printf("\nAREA: %.2f", circle.calculateArea());

        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
        calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */

        //FourValues fourValues = new FourValues();
        //System.out.printf("Diference: %d", fourValues.calculateFourValues());

        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
        o valor que recebe por hora e calcula o salário desse funcionário.
        A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        */

        //Employee employee = new Employee();
        //employee.enterInputData();

        //System.out.printf("""
        // \nEmployee: %s
        //Hours: %.2f
        //  Value: %.2f
        // Salary: R$ %.2f
        // """, employee.getRegister(), employee.getWorkedHours(), employee.getValueOfHour(), employee.calculateSalary());

        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1,
        o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
        o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        */

        List<Products> productsList = new ArrayList<>();

        Products productOne = new Products();
        productOne.calculateTotal();

        Products productTwo = new Products();
        productTwo.calculateTotal();

        productsList.add(productOne);
        productsList.add(productTwo);

        System.out.println("----------------------");

        for (Products p : productsList) {
            System.out.println("Code: " + p.getCode());
            System.out.printf("Quantity: %.0f \n", p.getQuantity());
            System.out.printf("Price: %.2f \n", p.getPrice());
            System.out.printf("Total: %.2f \n", p.getTotal());
            System.out.println("----------------------");
        }

        System.out.printf("\nThe value your pay is: %.2f", productOne.getTotal() + productTwo.getTotal());
        
    }
}