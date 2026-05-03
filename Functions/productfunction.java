public class productfunction {

    public static int product(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        /*
        int product = product(a,b);
        System.out.println("= " + product);
        */
        System.out.println("Product is = " + product(a,b));
    }
}