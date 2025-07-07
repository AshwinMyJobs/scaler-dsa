package dsa.arraya;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5};

        System.out.println("Max sub array sum is : " + maxSubArray(inputArray));
    }

    private static int maxSubArray(int[] A){

        int ans = Integer.MIN_VALUE;
        int currenSum = 0;

        for (int i = 0; i < A.length; i++) {

            currenSum += A[i];

            if(currenSum>ans) ans = currenSum;

            if(currenSum<0) currenSum = 0;
        }

        return ans;
    }
}
