package dsa.arrayas;

import java.util.Arrays;

public class PrefixSumArray {

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(inputArray).forEach(System.out::print);
        System.out.println();
        createPrefixSumArray(inputArray);
        System.out.println();
    }

    private static void createPrefixSumArray(int[] A){

        int[] preFixSum = new int[A.length];

        preFixSum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            preFixSum[i] = preFixSum[i-1] + A[i];
        }
        Arrays.stream(preFixSum).forEach(i->System.out.print(i + " "));
    }
}
