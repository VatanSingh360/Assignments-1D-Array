import java.util.Scanner;

public class Fourth_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Row : ");
        int r = sc.nextInt();
        System.out.print("Enter size of Column : ");
        int c= sc.nextInt();
        System.out.println("Enter elements of Matrix : ");
        int [][] arr = new int[r][c];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                if (max < arr[i][j]) max= arr[i][j];
            }
        }
        System.out.println(max);
    }
}
