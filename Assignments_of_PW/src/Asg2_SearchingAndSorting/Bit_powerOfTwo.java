package Asg2_SearchingAndSorting;

import java.util.Scanner;

public class Bit_powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // with & operator
       if (n>0 && (n&(n-1))==0) System.out.println("yes");
        else System.out.println("no");

       //power of 2 using Brian Kernighan’s algorithm:
    }
}
