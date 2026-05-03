public class function {
    public static void printhw (){
        System.out.println("Hello World");
    }

    public static int CalculateSum (int num1, int num2){   //with return type int
        int sum = num1 + num2;
        return sum;
    }

    public static void CalculateSum2 (){    //with return type void
        int num1 = 2; int num2 = 6;
        int sum = num1 + num2;
        System.out.println("sum is " + sum);
    }

    public static void main(String args[]) {
        printhw();       //timepass

        int a = 6; int b = 5;
        int sum = CalculateSum(a, b);
        System.out.println("another sum is: " + sum);
        
        CalculateSum2();
    }
}