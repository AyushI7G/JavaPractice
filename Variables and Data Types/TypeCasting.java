import java.util.*;

//Explicit conversion or narrowing conversion ; typecasting
public class TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float marks = 99.999f;
        int finalmarks = (int) marks;
        System.out.println(finalmarks);

        float a = 12.16f;
        int b = (int) a;
        System.out.println(b);
    }
}