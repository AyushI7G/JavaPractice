public class TypePromotion {
    public static void main(String args[]) {
        short a = 5;
        byte b = 25;
        char c ='c';
        int bt = (a + b + c);
        System.out.println("Output: " + bt);
        System.out.println("Directly printing: " + (a + b + c));
    }
}