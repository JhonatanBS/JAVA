public class IMC {
    public Double height;
    public Double weight;

    public IMC(Double height, Double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Double calculateIMC() {
        Double imc = this.weight / Math.pow(height, 2.0);
        return  imc;
    }
}
