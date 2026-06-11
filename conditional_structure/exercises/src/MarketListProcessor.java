import java.util.Scanner;

public class MarketListProcessor {
    Integer code = null;
    Integer quantity = null;

    public void listOfProducts() {
        System.out.print("""

                | CODIGO | ESPECIFICAÇÃO   | PRECO   |
                |   1    | Cachorro Quente | R$ 4,00 |
                |   2    | X-Salada        | R$ 4,50 |
                |   3    | X-Bacon         | R$ 5,00 |
                |   4    | Torrada simples | R$ 2,00 |
                |   5    | Refrigerante    | R$ 1,50 |

                """);
    }

    public Double calculateProduct() {
        enterValueOfData();
        return switch (this.code) {
            case 1:
                 yield 4.00 * this.quantity;
            case 2:
                yield 4.50 * this.quantity;
            case 3:
                yield 5.00 * this.quantity;
            case 4:
                yield 2.00 * this.quantity;
            case 5:
                yield 1.50 * this.quantity;
            default:
                System.out.println("Please, enter with value in the list");
                yield 0.00;
        };
    }

    public void enterValueOfData() {
        Scanner scanner = new Scanner(System.in);

        verifyInputOfData(scanner, "Enter with code of product: ", "\nEnter with quantity of product: ");
    }

    public void verifyInputOfData(Scanner scanner, String firstMessage, String secondMessage) {
        while (this.code == null || this.quantity == null) {
            try {
                listOfProducts();
                System.out.print(firstMessage);
                this.code = scanner.nextInt();
                System.out.print(secondMessage);
                this.quantity = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("\nError: Please, input value valid!");
                scanner.nextLine();
            }
        }
    }
}
