package dsa.arraya;

import java.util.Arrays;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {

        int[] A = {6,-2,3,1,8,2,4,5,7,9,50,100};

        System.out.println(missingInteger(A));

    }

    private static int missingInteger(int[] A){

        boolean[] flagArray = new boolean[A.length+1];

        Arrays.fill(flagArray, false);

        for (int i = 0; i < A.length; i++) {

            int presentInteger = A[i];

            if(!(presentInteger<0 || presentInteger>A.length+1))
            flagArray[presentInteger] = true;
        }

        for (int i = 1; i < A.length; i++) {
            if(flagArray[i]==false) return i;
        }

        return -1;
    }

    private static int practice1(int[] A){
        boolean[] flagArray = new boolean[A.length+1];

        Arrays.fill(flagArray, false);

        for (int i = 0; i < A.length; i++) {
            int presentInteger = A[i];

            if(!(presentInteger<0 || presentInteger>A.length+1)) {
                flagArray[presentInteger] = true;
            }
        }

        for (int i = 1; i < A.length; i++) {
            if(flagArray[i]==false)
                return i;
        }

        return -1;
    }

    private static int practice2(int[] A){
        boolean[] flagArray = new boolean[A.length+1];
        Arrays.fill(flagArray, false);

        for (int i = 0; i < A.length; i++) {
            int presentElement = A[i];

            if(!(presentElement<0 || presentElement>A.length+1))
                flagArray[presentElement] = true;
        }

        for (int i = 0; i < A.length; i++) {
            if(flagArray[i]==false) return i;
        }

        return -1;
    }

    private static int practice3(int[] A){
        boolean[] flagArray = new boolean[A.length+1];
        Arrays.fill(flagArray, false);

        for (int i = 0; i < A.length; i++) {
            if(flagArray[i] == false) return i;
        }

        return -1;
    }

}
