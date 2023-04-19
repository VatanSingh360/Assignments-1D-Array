import java.util.Scanner;

public class Peek_Ele_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of Array :");
        for (int i = 1; i <arr.length ; i++) {
            if ((arr[i]>arr[i-1])&&(arr[i]>arr[i+1]))
            System.out.println(arr[i]);
        }


    }
}
