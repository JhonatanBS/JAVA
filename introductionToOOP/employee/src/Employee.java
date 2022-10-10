public class Employee {
    String name;
    double grossSalary;
    double tax;

    public double netSalary() {
      return grossSalary - tax;
    }

    public double increaseSalary(double percentage) {
      return netSalary() + (percentage/100) * grossSalary;
    }
}
