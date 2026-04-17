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

        Employee employee = new Employee();
        employee.enterInputData();

        System.out.printf("""
                \nEmployee: %s
                Hours: %.2f 
                Value: %.2f 
                Salary: R$ %.2f
                """, employee.getRegister(), employee.getWorkedHours(), employee.getValueOfHour(), employee.calculateSalary());

    }
}