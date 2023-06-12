import java.util.Scanner;

public class FiboPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int x= Fiboprint(n);
        System.out.println(x);
    }

    private static int Fiboprint(int n) {
        if (n==1||n==0) return n;
        return Fiboprint(n-1)+Fiboprint(n-2);
    }
}
