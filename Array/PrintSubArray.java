public class PrintSubArray {
    public static void printsubarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                System.out.print("(");
                for(int k = i; k <= j; k++){
                    if(k == j){
                        System.out.print(arr[k]);
                    }
                    else{
                        System.out.print(arr[k] + ",");
                    }                    
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int [] arr = {10, 20, 30, 40, 50, 60};
        printsubarr(arr);
    }
}