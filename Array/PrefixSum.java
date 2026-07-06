public class PrefixSum {
    public static int maxsum(int arr[]){
        int prefix [] = new int [arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int maxsum = 0, currsum = 0;
        for(int start = 0; start < arr.length; start++){
            for(int end = start; end < arr.length; end++){
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        return maxsum;
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int result = maxsum(arr);
        System.out.println("Max sum of the subarray by prefix sum method is: " + result);
    }
}