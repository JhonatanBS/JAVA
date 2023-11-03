public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return this.height * this.width;
    }

    public double perimeter() {
        return this.height * 2 + this.width * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(this.height,2) + Math.pow(this.width,2));
    }
}
