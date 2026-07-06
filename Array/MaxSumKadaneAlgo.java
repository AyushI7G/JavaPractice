import java.util.*;
public class MaxSumKadaneAlgo {
    public static void KadaneAlgo(int arr[]) {
        int currsum = 0, maxsum = Integer.MIN_VALUE;
        //for all negative values
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                flag = 1;
            }
        }
        if(flag == 0){
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println("Max sum of the subarray by Kadane Algorithm is: " + max);
            return;
        }
        for(int i = 0; i < arr.length; i++){
            currsum += arr[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("Max sum of the subarray by Kadane Algorithm is: " + maxsum);
    }

    public static void main(String args[]) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        KadaneAlgo(arr);
    }
}