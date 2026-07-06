public class TrappingRainWater {
    public static int trappedwater(int height[]){
        int n = height.length;
        int [] leftmaxbound = new int [n];

        //left max bound array
        leftmaxbound[0] = height[0];
        for(int i = 1; i < n; i++){
            if(height[i] > leftmaxbound[i-1]){
                leftmaxbound[i] = height[i];
            }
            else{
                leftmaxbound[i] = leftmaxbound[i-1];
            }
        }

        /*

        System.out.print("Left bound array: ");

        for(int i = 0; i < n; i++){
            System.out.print(leftmaxbound[i] + " ");
        }
        System.out.println();

        */

        //right max bound array
        int [] rightmaxbound = new int [n];
        rightmaxbound[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            if(height[i] > rightmaxbound[i+1]){
                rightmaxbound[i] = height[i];
            }
            else{
                rightmaxbound[i] = rightmaxbound[i+1];
            }
        }

        /*

        System.out.print("Right bound array: ");

        for(int i = 0; i < n; i++){
            System.out.print(rightmaxbound[i] + " ");
        }

        System.out.println();

        */

        //water trapped
        int totalwater = 0, currwater = 0;
        for(int i = 0; i < n; i++){
            currwater = Math.min(rightmaxbound[i], leftmaxbound[i]);
            totalwater += currwater - height[i];
        }

        return totalwater;
         
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.print("Total trapped water: " + trappedwater(height));
    }
}