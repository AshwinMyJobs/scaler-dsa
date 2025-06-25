package dsa.arraya;

public class FindPairsCarryForward {

    public static void main(String[] args) {
        String input = "adgaggag";
        System.out.println(findParisWithCarryForwardTechnique(input));
    }

    private static int findParisWithCarryForwardTechnique(String A){
        int ans = 0;
        int count = 0;

        for(int i=A.length()-1; i>=0; i--){
            if(A.charAt(i)=='g'){
                count++;
            }
            if(A.charAt(i)=='a'){
                ans = ans + count;
            }
        }

        return ans;
    }
}
