import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter ele of Array : ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Sorted Array by Bubble Sort is : ");
        sorted(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-i-1 ; j++) {
             if (arr[j]>arr[j+1]){
                 int temp = arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1]=temp;
                 flag=true;
             }
            }
            if (!flag) break;
        }
    }
}
