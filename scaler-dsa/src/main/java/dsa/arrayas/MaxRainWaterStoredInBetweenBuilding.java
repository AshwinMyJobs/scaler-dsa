package dsa.arrayas;

public class MaxRainWaterStoredInBetweenBuilding {

    public static void main(String[] args) {
        int[] A = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(maxWaterStored(A));
    }

    private static int maxWaterStored(int[] A){
        int n = A.length;
        int left = 0, right = n - 1;
        int res = 0, maxleft = 0, maxright = 0;

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

    private static int practice1(int[] A){
        int n = A.length;
        int left = 0, right = n-1;
        int result = 0, maxLeft = 0, maxRight = 0;

        while(left<=right){
            if(A[left]<=A[right]){
                if(A[left] >= maxLeft)
                    maxLeft = A[left];
                else
                    result = result + maxLeft-A[left];
                left++;
            }else{
                if(A[right]>=maxRight)
                    maxRight = A[right];
                else
                    result = result + maxRight - A[right];
                right--;
            }
        }

        return result;
    }

    private static int practice2(int[] A){
        int n = A.length;
        int left = 0, right = n-1;
        int result = 0, maxLeft = 0, maxRight = 0;

        while(left<=right){
            if(A[left]<=A[right]){
                if(A[left]>=maxLeft)
                    maxLeft = A[left];
                else
                    result = result + maxLeft - A[left];
                left++;
            }else{
                if(A[right]>=maxRight)
                    maxRight = A[right];
                else
                    result = result + maxRight - A[right];
                right--;
            }
        }

        return result;
    }

    private static int practice3(int[] A){
        int n = A.length;
        int left = 0, right = n-1;
        int result = 0, maxLeft = 0, maxRight = 0;

        while(left<=right){
            if(A[left]<=A[right]){
                if(A[left]>=maxLeft)
                    maxLeft = A[left];
                else
                    result = result + maxLeft - A[left];
                left++;
            }else{
                if(A[right]>=maxRight)
                    maxRight = A[right];
                else
                    result = result + maxRight - A[right];
                right--;
            }
        }
        return result;
    }
}
