/* ArithmeticOperators; 
Unary Operators
Post and Pre increment and decrement */

public class ArithmeticOperators {
    public static void main(String args[]) {
         //pre increment
        int a = 10;
        int b = ++a;                 // first 'a' will be changed to 11 then -> it will be assigned to 'b' which  = 11
        System.out.println(a);      // a = 11
        System.out.println(b);     // b = 11

        a = 10;                    
        b = a++;                   // first 'a' will be used -> hence assigned to 'b' = 10 then it will change -> now 'a' = 11  
        System.out.println(a);    // printing later on a = 11
        System.out.println(b);   // b = 10

        a = 10;                  
        b = --a;                    // now 'a' = 9 so 'b' = 9 
        System.out.println(a);      // 'a' = 9
        System.out.println(b);      // 'b' = 9

        a = 10;                       
        b = a--;                    // a is 10 first it will be used hence 'b' = 10 and them changed 'a' = 9
        System.out.println(a);      // a = 9
        System.out.println(b);       //b = 10
    }
}