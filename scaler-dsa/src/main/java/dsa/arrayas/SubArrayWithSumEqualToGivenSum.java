package dsa.arrayas;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumEqualToGivenSum {
    public static void main(String[] args) {

    }

    private static void subArrayWithSumEqualToGivenSum(int[] A, int inputSum){

        int current_Sum=0, startIndex=0, endIndex=-1;
        Map<Integer,Integer> prefixMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            current_Sum = current_Sum + A[i];

            if(current_Sum-inputSum==0){
                startIndex=0;
                endIndex=i;
                break;
            }

            if(prefixMap.containsKey(current_Sum-inputSum)){
                startIndex = prefixMap.get(current_Sum-inputSum)+1;
                endIndex = i;
                break;
            }

            prefixMap.put((current_Sum-inputSum),i);

        }

        if(endIndex==-1){
            System.out.println("No such sub array exists");
        }else{
            System.out.println("Sub array start and end index are : " + startIndex + " and " + endIndex);
        }
    }

    private static void practice1(int[] A, int inputSum){

        int current_Sum=0, startIndex=0, endIndex=-1;

        Map<Integer,Integer> prefixMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            current_Sum = current_Sum + A[i];

            if(current_Sum-inputSum==0){
                startIndex=0;
                endIndex=i;
                break;
            }

            if(prefixMap.containsKey(current_Sum-inputSum)){
                startIndex = prefixMap.get(current_Sum-inputSum) + 1;
                endIndex = i;
                break;
            }

            prefixMap.put((current_Sum-inputSum),i);
        }

        if(endIndex==-1){
            System.out.println("No such subarray exists");
        }else{
            System.out.println("Sub array start and end index are : " + startIndex + " and " + endIndex);
        }
    }

    private static void practice2(int[] A, int inputSum){

        int current_sum=0, startIndex=0, endIndex=-1;
        Map<Integer, Integer> prefixMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            current_sum = current_sum + 1;

            if(current_sum-inputSum==0){
                startIndex = 0;
                endIndex = i;
                break;
            }

            if(prefixMap.containsKey((current_sum-inputSum))){
                startIndex = prefixMap.get((current_sum-inputSum)) + 1;
                endIndex = i;
                break;
            }

            prefixMap.put((current_sum-inputSum),i);
        }

        if(endIndex==-1){
            System.out.println("No such subarray exists");
        }else {
            System.out.println("Sub array start and end index are : " + startIndex + " and " + endIndex);
        }
    }

    private static void practice3(int[] A, int inputSum){

        int current_Sum=0, startIndex=0, endIndex=-1;
        Map<Integer,Integer> prefixMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            current_Sum = current_Sum + 1;

            if(current_Sum-inputSum==0){
                startIndex = 0;
                endIndex = i;
                break;
            }

            if(prefixMap.containsKey((current_Sum-inputSum))){
                startIndex = prefixMap.get((current_Sum-inputSum)) + 1;
                endIndex = i;
                break;
            }
        }

        if(endIndex==-1){
            System.out.println("No such subarray exists");
        }else {
            System.out.println("Sub array start and end index are : " + startIndex + " and " + endIndex);
        }
    }
}
