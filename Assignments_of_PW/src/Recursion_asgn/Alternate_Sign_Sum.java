package Recursion_asgn;

import java.util.Scanner;

public class Alternate_Sign_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get sum : ");
        int n= sc.nextInt();
        System.out.println("Total sum is :"+SumOfSign(n));
    }

    private static int SumOfSign(int n) {
        if (n==0) return n;
        while (n!=0){
            if (n%2==0) return SumOfSign(n-1)-n;
            else return SumOfSign(n-1)+n;
        }
        return -1;
    }
}
