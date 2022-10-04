public class Bhaskara {
    public Double a;
    public Double b;
    public Double c;

    public Bhaskara(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void equationBhaskara() {
        System.out.printf("%.2f %.2f %.2f",this.a,this.b,this.c);
        Delta delta = new Delta(this.a,this.b,this.c);
        double x = (- this.b + Math.sqrt(delta.equationDelta())) / (2 * this.a);
        double y = (- this.b - Math.sqrt(delta.equationDelta())) / (2 * this.a);
        System.out.println("\nFirst root of the equation is " + x);
        System.out.println("Second root of the equation is " + y);
    }
}
