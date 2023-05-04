import java.util.Scanner;

public class Squre_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get squre root : ");
        int num = sc.nextInt();
        int res = findRoot(num);
        System.out.println("Squre root of : "+num+" is : "+res );
    }

    private static int findRoot(int num) {
        int res=-1,low=0,high=num;
        while(low<=high){
            int mid = low+(high-low)/2;
            int val = mid*mid;
            if (val==num) return mid;
            else if (val<num) {
                //res = mid;
                low = mid+1;
            }
            else high= mid-1;
        }
        return res;
    }
}
