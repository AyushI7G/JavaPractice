public class functionOverloading {
    public static int sum(int a, int b) {      
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String args[]){
        System.out.println(sum(2,3));
        System.out.println(sum(2,8,8));
        System.out.println(sum(2.5f,3.5f));
        System.out.println(sum(2.5f,8.5f,7));
    }
}

