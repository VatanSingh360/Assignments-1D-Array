package Recursion_asgn;

import java.util.Scanner;

public class Sum_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size and elements of Array : ");
        int s = sc.nextInt();
        int arr[]= new int[s];
        for (int i = 0; i < arr.length ; i++) arr[i]= sc.nextInt();
        System.out.print("sum of Array Elements is :"+ sumArray(arr,0));
    }

    private static int sumArray(int[] arr, int i) {

        if (i==arr.length-1) return arr[i];
        return sumArray(arr,i+1)+arr[i];
    }
}
