import java.util.Arrays;

public class Ques_4 {
    public static void main(String[] args) {
        int [] arr ={9};
        Plus_One(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] Plus_One(int[] arr) {
        int n = arr.length;
        int [] res = new int[n+1];
        for (int i = n-1; i >=0 ; i--) {
            if (arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        res[0]=1;
        return res;
    }
}
