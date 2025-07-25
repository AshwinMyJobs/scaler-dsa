package dsa.arrayas;

public class EqulibriumIndex {

    public static void main(String[] args) {
        int[] inputArray = {-7, 1, 5, 2, -4, 3, 10};
        //int[] inputArray = {-1,-2,-3,-4,-5,6,-7,-8};

        System.out.println(equlibriumIndex(inputArray));
    }

    private static int equlibriumIndex(int[] A){

        int sum1 = 0;
        for (int i = 0; i < A.length; i++) {
            sum1+=A[i];
        }

        int ans = Integer.MAX_VALUE;

        int sum2 = 0;

        for (int i = 0; i <A.length ; i++) {
            sum1 = sum1 - A[i];
            if(sum1==sum2){
                ans = i;
                break;
            }
            sum2 = sum2 + A[i];
        }

        if(ans==Integer.MAX_VALUE)
            return -1;

        return ans;
    }

    private static int practice1(int[] A){
        int sum1 = 0, sum2 = 0, ans = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            sum1 = sum1 + A[i];
        }

        for (int i = 0; i < A.length; i++) {
            sum1 = sum1 - A[i];

            if(sum1==sum2){
                ans = i;
                break;
            }

            sum2 = sum2 + A[i];

        }

        if(ans!=Integer.MAX_VALUE)
            return ans;
        else
            return -1;
    }

    private static int practice2(int[] A){
        int sum1=0, sum2=0, ans=Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            sum1 = sum1 + A[i];
        }

        for (int i = 0; i < A.length; i++) {
            sum1 = sum1 - A[i];

            if(sum1==sum2){
                ans = i;
                break;
            }

            sum2 = sum2 + A[i];
        }

        if(ans!=Integer.MAX_VALUE)
            return ans;
        else
            return -1;
    }

    private static int practice3(int[] A){
        int sum1=0, sum2=0, ans=Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {

            sum1 = sum1 - A[i];
            if(sum1==sum2){
                ans = i;
                break;
            }

            sum2 = sum2 + A[i];
        }

        if(ans!=Integer.MAX_VALUE)
            return ans;
        else
            return -1;
    }
}
