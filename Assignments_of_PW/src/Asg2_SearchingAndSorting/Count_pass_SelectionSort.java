package Asg2_SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Count_pass_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        int res = count_DescingPass(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("Number of Passes is : "+ res);

    }

    private static int count_DescingPass(int[] arr) {
        int count =0;
        for (int i = 0; i < arr.length ; i++) {
            int min_idx =i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]>arr[min_idx]) min_idx=j;
            }
            if (min_idx!=i){
                int temp = arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        return count;
    }
}
