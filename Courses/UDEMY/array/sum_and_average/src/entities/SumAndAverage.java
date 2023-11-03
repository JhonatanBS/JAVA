package entities;

public class SumAndAverage {
    public double arrayNumbers[];
    public int i;

    public SumAndAverage(double arrayNumbers[]) {
        this.arrayNumbers = arrayNumbers;
    }

    public  double Sum() {
        double sum = 0;
        while(i < this.arrayNumbers.length ) {
            sum += arrayNumbers[i];
            i++;
        }
        return sum;
    }

    public double Average(double sum) {
        double average =  sum / arrayNumbers.length;
        return average;
    }

    public void showPositionValues() {
        int index = 0;
        while(index < this.arrayNumbers.length ) {
            System.out.printf("%.2f  ", this.arrayNumbers[index]);
            index++;
        }
    }
}
