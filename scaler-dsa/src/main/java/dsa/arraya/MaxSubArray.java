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

    private static int practice1(int[] A){
        int ans=Integer.MIN_VALUE, currentSum=0;

        for (int i = 0; i < A.length; i++) {
            currentSum = currentSum + A[i];

            if(currentSum>ans) ans = currentSum;

            if(currentSum<0) currentSum = 0;
        }

        return ans;
    }

    private static int practice2(int[] A){
        int ans=Integer.MIN_VALUE, currentSum=0;

        for (int i = 0; i < A.length; i++) {
            currentSum = currentSum + A[i];

            if(currentSum>ans) ans = currentSum;

            if(currentSum<0) currentSum = 0;
        }

        return ans;
    }

    private static int practice3(int[] A){
        int ans=Integer.MIN_VALUE, currentSum=0;

        for (int i = 0; i < A.length; i++) {
            currentSum = currentSum + A[i];

            if(currentSum>ans) ans = currentSum;

            if(currentSum<0) currentSum = 0;
        }

        return currentSum;
    }
}
