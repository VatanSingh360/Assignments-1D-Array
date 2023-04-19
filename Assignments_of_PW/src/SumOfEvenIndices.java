import java.util.Scanner;
// First Ques
public class SumOfEvenIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < arr.length; i++)
            arr[i]= sc.nextInt();

        int sum =0;
        for (int i = 0; i < arr.length; i=i+2)
            sum = sum+arr[i];

        System.out.println(sum);
    }
}
