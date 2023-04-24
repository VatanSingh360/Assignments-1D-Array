import java.util.Scanner;

public class PreFix_Sum_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Row : ");
        int r = sc.nextInt();
        System.out.print("Enter size of Column : ");
        int c= sc.nextInt();
        System.out.println("Enter elements of Matrix : ");
        int [][] arr = new int[r][c];
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter starting Row :");
        int r1 = sc.nextInt();
        System.out.print("Enter ending Row :");
        int r2 = sc.nextInt();
        System.out.print("Enter starting Column :");
        int c1= sc.nextInt();
        System.out.print("Enter ending Column :");
        int c2= sc.nextInt();
        int sum =0,up=0,left=0,repeated=0;
        sum = arr[r1][c2];


    }
}
