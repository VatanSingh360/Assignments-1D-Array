package Recursion;

import java.util.Scanner;

public class FindingPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = powerOf(a,b);
        System.out.println("a^b is :" + res);
    }

    private static int powerOf(int a, int b) {
        int mid=0,res=0,fres=0;
        if (b==1) return a;
        mid = b/2;
        res = powerOf(a,mid);
        fres = res*res;
        if (b%2==0) return fres;
        else return a*fres;
    }
}
