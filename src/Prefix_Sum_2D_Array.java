import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Prefix_Sum_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        int r = sc.nextInt();
        System.out.print("Enter size of column :");
        int c = sc.nextInt();
        System.out.println("Enter elements of Matrix : ");
        int [][] arr = new int[r][c];

        for (int k = 0; k < r ; k++)
            for (int l = 0; l < c; l++)
                arr[k][l]=sc.nextInt();
        System.out.print("Enter starting of Row : ");
        int r1 = sc.nextInt();

        System.out.print("Enter starting of Column : ");
        int c1= sc.nextInt();

        System.out.print("Enter Ending of Row : ");
        int r2 = sc.nextInt();

        System.out.print("Enter ending of Column : ");
        int c2 = sc.nextInt();
        // Naive Approch
        int sum =0;
        for (int i = r1; i < r2; i++)
            for (int j = c1; j <c2 ; j++)
                sum+=arr[i][j];
        System.out.println(sum);
        //Optimised Approch
        prefixSumMatrix(arr);
        int res = sumResign(arr,r1,r2,c1,c2);
        System.out.println(res);
    }
    private static void prefixSumMatrix(int[][] arr) {
        int m= arr.length,n=arr[0].length;
        //row wise prefix sum
        for (int i = 0; i < m; i++)
            for (int j = 1; j <n ; j++)
                arr[i][j]+=arr[i][j-1];
        // column wise prefix sum
        for (int i = 1; i <m ; i++)
            for (int j = 0; j < n; j++)
                arr[i][j]+=arr[i-1][j];


    }

    private static int sumResign(int[][] arr, int r1, int r2, int c1, int c2) {
        int sum =0,up =0,left =0,repeted_region =0,res =0;
        sum= arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeted_region = arr[r1-1][c1-1];
        res = sum-up-left+repeted_region;
        return res;
    }


}
