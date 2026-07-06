import java.util.*;

public class basics {
    public static void main(String[] args) {
        int marks [] = {97, 98, 100, 95, 96};
        String students [] = new String [5];
        // data type array name [] = new data type [size];
        Scanner sc  =  new Scanner(System.in);
        for(int i = 0; i < students.length; i++){
            students[i] = sc.nextLine();
        }

        for(int i = 0; i < students.length; i++){
            System.out.print(students[i] + " ");
        }
    }
}
