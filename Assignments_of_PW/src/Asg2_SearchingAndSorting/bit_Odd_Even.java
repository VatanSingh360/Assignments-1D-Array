package Asg2_SearchingAndSorting;

import java.util.Scanner;

public class bit_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check : ");
        int n= sc.nextInt();
        if ((n&1)==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
