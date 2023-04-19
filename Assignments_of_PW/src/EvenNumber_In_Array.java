import java.util.Scanner;
//second Question
public class EvenNumber_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < arr.length; i++)   arr[i]= sc.nextInt();


        for (int ele :arr) {
            if (ele%2==0)
                System.out.println(ele);
        }
    }
}
