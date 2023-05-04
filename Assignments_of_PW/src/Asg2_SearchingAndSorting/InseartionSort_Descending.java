package Asg2_SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class InseartionSort_Descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array Elements : ");
        for (int i = 0; i < n; i++) arr[i]= sc.nextInt();
        inseartionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void inseartionSort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int j=i;
            while(j > 0&&arr[j]>arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
