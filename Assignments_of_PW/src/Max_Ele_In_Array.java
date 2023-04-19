import java.util.Scanner;
// Third Question
public class Max_Ele_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter elements of Array : ");
        for (int i = 0; i <arr.length ; i++)   arr[i]= sc.nextInt();

        int max = Integer.MIN_VALUE;
        for (int ele:arr) {
            if (max < ele) max =ele;
        }
        System.out.println(max);
    }
}
