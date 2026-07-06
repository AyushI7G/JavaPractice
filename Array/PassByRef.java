public class PassByRef {
    public static void update(int marks[], int num){
        num = 10; //non changeable 
        //pass by value
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1; //changeable
            //pass by reference
        }
    }
    public static void main(String args[]){
        int marks[] = {95, 98, 99};
        int num = 5;
        update(marks, num);

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.print("\nnum = " + num);
    }
}