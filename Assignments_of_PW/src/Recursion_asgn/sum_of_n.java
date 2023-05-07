package Recursion_asgn;

import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(totalSum(n));
    }

    private static int totalSum(int n) {
        int res=0;
        while(n!=0){
            int sum=n%10;
            return (res+sum)+totalSum(n/10);
        }
        return res;
    }
}
