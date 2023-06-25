package Mock_Test;

import java.util.Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        trailZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void trailZeros(int[] arr) {
        int j=0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i]!=0){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
            }

        }
    }
}
