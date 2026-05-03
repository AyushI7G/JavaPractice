public class LogicalOperators {
    public static void main(String args[]) {
        System.out.println((3 > 2) && (7 < 9));  //T AND T = T

        System.out.println((3 > 2) && (7 > 9));  //T AND F = F
        
        System.out.println((3 > 2) || (7 > 9));   //T OR F = T

        System.out.println((3 < 2) && (7 > 9));   //F OR F = F

        System.out.println( !(3 > 2) );     // !T = F
        System.out.println( !(3 < 2) );     // !F = T

    }
}