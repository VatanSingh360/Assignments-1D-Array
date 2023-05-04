package Asg2_SearchingAndSorting;

import java.util.Scanner;

public class Last_Occourence {
    //Second Ques
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int s = sc.nextInt();
        int [] arr = new int[s];
        System.out.println("Enter elements of Arrray :");
        for (int i = 0; i < s; i++)
            arr[i]= sc.nextInt();
        System.out.print("Enter target element : ");
        int target = sc.nextInt();
        int res = firstOccurence(arr,target);
         System.out.println(res);
    }

    private static int firstOccurence(int[] arr, int target) {
        int res =-1,low =0,high = arr.length-1;
        while (low< high){
            int mid = low+(high-low)/2;
            if (arr[mid]==target){
                res = mid;
                low = mid+1;

            } else if (arr[mid]>target) high=mid-1;
            else high = mid-1;

        }
        return res;
    }
}
