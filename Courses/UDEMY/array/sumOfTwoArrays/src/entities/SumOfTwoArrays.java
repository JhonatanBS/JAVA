package entities;

public class SumOfTwoArrays {

    public Integer[] arrayA;
    public  Integer[] arrayB;
    public  Integer[] arrayC;

    public Integer[] sumOFTwoArrays(int quantity) {
        int i;
        Integer[] array = new Integer[quantity];
        for(i = 0; i < quantity; i++ ) {
            array[i] = arrayA[i] + arrayB[i];
        }
        return array;
    }
}
