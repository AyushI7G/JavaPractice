public class ReverseTheArray {
    public static void reversearr(int arr[]){
        int first = 0, last = arr.length-1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 50, 60};
        reversearr(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}