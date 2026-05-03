public class dectobin {
    public static void binary(int n) {
        int number = n;
        int rem;
        int binary = 0;
        int pow = 0;
        while(n > 0){
            rem = n % 2;
            n = n / 2;
            binary = binary + rem * (int)Math.pow(10,pow);
            pow++;
        }
        System.out.println("Binary form of " + number + " is: " + binary);
    }
    public static void main(String[] args){
        binary(12);
    }
}