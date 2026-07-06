public class LargestAndSmallestNum {
    public static int largest(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(largest < array[i]){
                largest = array[i];
            }
        }
        return largest;
    }
    public static int smallest(int array[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int array[] = {10, 18, 16, 15, 20};
        int largest = largest(array);
        System.out.println("Largest Number: " + largest);
        int smallest = smallest(array);
        System.out.print("Smallest Number: " + smallest);
    }
}