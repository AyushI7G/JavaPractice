public class BinomialCoeffunction {
    
    public static int fact(int n) {
        if( n <= 1 ){
            return 1;
        }

        else {
            return n * fact(n-1);
        }
    }

    public static int bincoeff(int n, int r) {
        return (fact(n)/(fact(r) * (fact((n-r)))));
    }

    public static void main(String args[]) {
        System.out.println(bincoeff(5,2));
    }
}