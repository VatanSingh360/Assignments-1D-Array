import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        sorting_process(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void sorting_process(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[min_idx]) min_idx=j;
            }
            if (min_idx!=i){
                int temp = arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
