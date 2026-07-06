public class MaxSumSubArray {
    public static int maxsumsubarr(int arr[]){
        int maxsum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                if(maxsum < sum){
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int result = maxsumsubarr(arr);
        System.out.println("Max sum of the subarray is: " + result);
    }
}