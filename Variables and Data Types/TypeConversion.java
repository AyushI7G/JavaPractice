import java.util.*;

public class TypeConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        float num = sc.nextInt();
        System.out.println(num); 
        
        /*
        int num = sc.nextFloat();               //We'll get lossy conversion error in this
        System.out.println(num); 
        */
    }
}