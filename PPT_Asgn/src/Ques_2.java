import java.util.Arrays;

public class Ques_2 {
    public static void main(String[] args) {
        int [] arr = {3,2,2,3};
        int val =3;
        int count =0;
        removeVal(arr,val,count);
        System.out.println(Arrays.toString(arr)+" "+count);
    }

    private static void removeVal(int[] arr, int val,int count) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==val) arr[i]= arr[i]-val;
            count++;
        }
    }
}
