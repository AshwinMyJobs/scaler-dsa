package dsa.arrayas;

public class SumOfAllSubArraySum {
    public static void main(String[] args) {

    }

    private static int sumOfAllSubArraySum(int[] A){
        int sum=0, n=A.length;

        for (int i = 0; i < A.length; i++) {
            sum = sum + ( A[i]*(n-i)*(i+1) );
        }
        return sum;
    }

    private static int practice1(int[] A){
        int sum=0, n=A.length;

        for (int i = 0; i < A.length; i++) {
            sum = sum + ( A[i]*(n-i)*(i+1) );
        }
        return sum;
    }

    private static int practice2(int[] A){
        int sum=0, n=A.length;

        for (int i = 0; i < A.length; i++) {
            sum = sum + ( A[i]*(n-i)*(i+1) );
        }

        return sum;
    }

    private static int practice3(int[] A){
        int sum=0,n=A.length;

        for (int i = 0; i < A.length; i++) {
            sum = sum + ( A[i]*(n-i)*(i+1) );
        }
        return sum;
    }
}
