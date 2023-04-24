import java.util.Scanner;

public class First_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive_numbers=0;
        int negative_numbers=0;
        int even_numbers=0;
        int odd_numbers=0;
        int number_of_0=0;
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
        for (int k = 0; k < i ; k++) {
            for (int l = 0; l < i ; l++) {
                if (arr[k][l]>0) positive_numbers++;
                 if (arr[k][l]<0) negative_numbers++;
                 if (arr[k][l]==0)number_of_0++;
                 if ((arr[k][l])%2==0)even_numbers++;
                 if ((arr[k][l])%2==1||(arr[k][l])%2==-1) odd_numbers++;
            }
        }
        System.out.println("Number of positive numbers : "+ positive_numbers);
        System.out.println("Number of negative numbers : "+ negative_numbers);
        System.out.println("Number of odd numbers : "+ odd_numbers);
        System.out.println("Number of even numbers : "+ even_numbers);
        System.out.println("Number of 0's : "+ number_of_0);
    }
}
