/* Enter cost of 3 items from the yser (using float data type) - a pencil, a penandan eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

import java.util.*;

public class Question1_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        double cost = (pen + pencil + eraser)*0.18;
        System.out.println("Total cost you have to pay: " + cost);
    }
}