public class PrintReverseNumber {
    public static void main(String args[]) {
        int n = 457866;
        while(n > 0){
            int r = n % 10;
            System.out.print(r);
            n /= 10;
        }
    }
}