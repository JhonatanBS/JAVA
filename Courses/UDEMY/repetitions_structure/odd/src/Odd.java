public class Odd {
    public int number;

    public Odd(int number) {
        this.number = number;
    }

    public void showOdd() {
        int i = 0;
        while(i < this.number) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
