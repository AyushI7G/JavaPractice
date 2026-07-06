public class BinarySearch {
    public static int IndexSearch(int array[], int key) {
        int start = 0, end = array.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(array[mid] == key){
                return mid;
            }
            else if(array[mid] < key){  //right
                start = mid + 1;
            }
            else{   // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int [] array = {10, 20, 30, 40, 50};
        int key = 20;
        int result = IndexSearch(array, key);
        System.out.print(result);
    }
}