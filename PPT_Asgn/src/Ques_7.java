import java.util.Arrays;

public class Ques_7 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        rightMove(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rightMove(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
}
