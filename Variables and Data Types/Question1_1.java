/*Average of three numbers*/

import java.util.*;

public class Question1_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int Avg = (A + B + C)/3;
        System.out.println("Average of these numbers: " + Avg);
    }
}