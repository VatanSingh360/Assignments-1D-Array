package Asg2_SearchingAndSorting;

import java.util.Scanner;

public class Check_Element {
    // First Ques
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : " );
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of Array : ");
        for (int i = 0; i <n ; i++)
            arr[i]= sc.nextInt();
        System.out.print("Enter target Element : ");
        int target =sc.nextInt();

        for (int i=0;i<arr.length;i++) {
            if (target==arr[i]) System.out.println("Element is found at index :" );
            else System.out.println("Element is not present in Array.");
        }
    }
}
