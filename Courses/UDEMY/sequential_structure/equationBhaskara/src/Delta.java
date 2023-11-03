public class Delta {
    public Double a;
    public Double b;
    public Double c;
    public Delta(Double a,Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double equationDelta(){
        double delta = Math.pow(b,2.0) - 4 * this.a * this.c;
        return delta;
    }
}
