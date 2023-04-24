import java.util.Arrays;
import java.util.Scanner;

public class Rotate_2D_Array {
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
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }


        for (int i = 0; i < r ; i++) {
            int li=0,ri=c-1;
            while (li<ri){
                int temp = arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
            for (int [] mat:arr) {
                System.out.println("Rotated matrix is : "+Arrays.toString(mat));
            }

     }
    }
