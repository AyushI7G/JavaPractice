public class mathFunc {
    public static void minNum (int x, int y) {
        int n = Math.min(x,y);                                 //between 2 numbers only
        System.out.println("Minimum number: " + n);
    }

    public static void maxNum(int x, int y) {
        int n = Math.max(x,y);                                  //between 2 numbers only
        System.out.println("Maximum number: " + n);      
    }

    public static void Squareroot(int x) {
        System.out.println("Square root of " + x + ": " + Math.sqrt(x));
    }

    public static void expoNum(int n, int p){
        System.out.println(n + " raise to " + p + ": " + Math.pow(n,p));
    }

    public static void absolute(int n){
        System.out.println("Absolute of " + n + ": " + Math.abs(n));
    }

    public static void main(String[] args) {
        minNum(55, 12);
        maxNum(55, 12);
        Squareroot(16);
        expoNum(2,3);
        absolute(-24);
    }
}