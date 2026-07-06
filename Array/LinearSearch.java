public class LinearSearch {
    public static int Search(String menu[], String key){
        for(int i = 0; i < menu.length; i++){
            if(key == menu[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] = {"Vada Pav", "Samosa", "Chaat", "Chole Bhature", "Coffee", "Latte"};
        String key = "Coffee";
        int result = Search(menu, key);
        System.out.print(result);
    }
}
