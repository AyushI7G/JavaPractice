public class SubArraysSum {
    public static void subarrsum(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int [] arr = {10, 20, 30, 40, 50, 60};
        subarrsum(arr);
    }
}