package Asg2_SearchingAndSorting;

import java.util.Scanner;

public class Perfect_Squre {
    // Question 5th
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get squre root : ");
        int num = sc.nextInt();
        boolean res = findRoot(num);
        System.out.println("Squre root of : "+num+" is : "+res );
    }

    private static boolean findRoot(int num) {
        boolean res= false;int low=0,high=num;
        while(low<=high){
            int mid = low+(high-low)/2;
            int val = mid*mid;
            if (val==num) return true;
            else if (val<num) {
                //res = mid;
                low = mid+1;
            }
            else high= mid-1;
        }
        return res;
    }
}
