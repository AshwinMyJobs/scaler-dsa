package dsa.arraya;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaxWaterStoredInBetweenBuilding {

    public static void main(String[] args) {
        int[] A = {1,0,2,5,1,0,3,0,0,7};
        construcPrefixMax(A);
        construcSuffixMax(A);
    }

    private static int maxWaterStored(int[] A){
        int n = A.length;
        int left = 0;
        int right = n - 1;
        int res = 0;
        int maxleft = 0, maxright = 0;

        while(left <= right){
            // When height of left side is lower, calculate height of water trapped in left bin else calculate for right bin
            if(A[left] <= A[right]){
                if(A[left] >= maxleft)
                    maxleft = A[left]; //This index wont store any water as there is no index towards the left whose height is greater than this.
                else
                    res += maxleft - A[left];
                left++;
            }
            else{
                if(A[right] >= maxright)
                    maxright = A[right]; //This index wont store any water as there is no index towards the right whose height is greater than this.
                else
                    res += maxright - A[right];
                right--;
            }
        }
        return res;
    }


    private static void construcPrefixMax(int[] A){
        int[] pMax = new int[A.length];
        pMax[0] = 0;

        for (int i = 1; i < A.length-1; i++) {
            pMax[i] = max(pMax[i-1], A[i-1]);
        }
        System.out.println("pMax");
        Arrays.stream(pMax).forEach(i-> System.out.print(i + " "));
    }

    private static void construcSuffixMax(int[] A){
        int[] sMax = new int[A.length];
        sMax[0] = 0;

        for (int i = A.length-2; i >= 0; i--) {
            sMax[i] = max(sMax[i+1], A[i+1]);
        }

        System.out.println("\n" + "sMax");
        Arrays.stream(sMax).forEach(i-> System.out.print(i + " "));
    }

    private static int max(int pMax, int i) {
        if (pMax>i)
            return pMax;
        else
            return i;
    }
}
