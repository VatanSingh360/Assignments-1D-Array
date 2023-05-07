package Recursion_asgn;

import java.util.Scanner;

public class max_in {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length ; i++)
            arr[i]= sc.nextInt();
        System.out.println(ArrayMax(arr,0));
    }

    private static int ArrayMax(int[] arr,int x) {
       if (x== arr.length-1) return arr[x];
       int max= ArrayMax(arr,x+1);
       return Math.max(arr[x],max);
    }

}
