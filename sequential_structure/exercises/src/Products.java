import java.util.Random;
import java.util.Scanner;

public class Products {
    private String code;
    private double quantity;
    private double total;
    private double price;

    public Products() {
    }

    public String getCode() {
        return code;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public double getPrice() {
        return price;
    }

    public void calculateTotal() {
        enterInputData();
        this.total = this.quantity * this.price;
    }

    public void enterInputData() {
        Scanner scanner = new Scanner(System.in);

        registerCode();

        this.quantity = verifyInputOfData(scanner, "Enter with total of products:");
        this.price = verifyInputOfData(scanner, "Enter with price unity of product");
    }

    public double verifyInputOfData(Scanner scanner, String message) {
        Double value = null;

        while (value == null) {
            try {
                System.out.println(message);
                value = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Error: Enter with value valid!");
                scanner.next();
            }
        }
        return value;
    }

    public void registerCode() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        int value;

        for (int i = 0; i < 3; i++) {
            value = random.nextInt(10);
            stringBuilder.append(value);
        }

        this.code = stringBuilder.toString();
    }
}
