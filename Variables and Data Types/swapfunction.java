public class swapfunction {
    public static void main(String args[]) {
        int a = 1;
        int b = 18;
        swap(a,b);
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}