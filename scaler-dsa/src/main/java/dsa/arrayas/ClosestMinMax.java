package dsa.arrayas;

public class ClosestMinMax {

    public static void main(String[] args) {

        int[] A = {2, 6, 1, 6, 9};
        System.out.println(solve(A));

    }


    private static int solve(int[] A) {

        int min_ele = Integer.MAX_VALUE, max_ele = Integer.MIN_VALUE;   // min and max value of the array
        int min_Index = -1, max_Index = -1; // index of the last element having value equal to min_ele and max_ele

        int ans = Integer.MAX_VALUE;
        for(int x:A){
            min_ele = Math.min(min_ele, x);
            max_ele = Math.max(max_ele, x);
        }

        for(int i=0 ; i<A.length ; i++){
            if(A[i] == min_ele) min_Index = Math.max(min_Index, i);
            if(A[i] == max_ele) max_Index = Math.max(max_Index, i);

            if(min_Index != -1 && max_Index != -1){
                int len = Math.abs(max_Index - min_Index) + 1;
                ans = Math.min(ans, len);
            }
        }

        return ans;
    }
}
