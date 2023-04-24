import java.util.Scanner;

public class Second_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Row : ");
        int i = sc.nextInt();
        System.out.print("Enter size of Column : ");
        int j= sc.nextInt();
        System.out.println("Enter elements of Matrix : ");
        int [][] arr = new int[i][j];
        for (int k = 0; k < i ; k++) {
            for (int l = 0; l < i; l++) {
                arr[k][l]=sc.nextInt();
            }
        }
        for (int k = 0; k<arr.length ; k++) {
            for (int l = arr[0].length-1; l >=0; l--) {
               if((l+k)==arr.length-1) System.out.println(arr[k][l]);
            }
        }
    }
}
