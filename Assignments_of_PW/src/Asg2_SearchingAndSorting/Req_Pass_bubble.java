package Asg2_SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Req_Pass_bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of Array : ");
        int n= sc.nextInt();
        System.out.println("Enter Elements of Array : ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i]= sc.nextInt();
        int res = countingBubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorting passes required are : "+ res);
    }

    private static int countingBubble(int[] arr) {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            boolean light = false;
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    count++;
                    light = true;
                }
            }
            if (!light) break;
        }
        return count;
    }
}
