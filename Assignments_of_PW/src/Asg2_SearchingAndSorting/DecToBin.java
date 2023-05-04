package Asg2_SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to convert in binary : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int id=0;
        while (n>0){
            arr[id++]= n%2;
            n=n/2;
        }
        for (int i = id-1; i >=0 ; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
