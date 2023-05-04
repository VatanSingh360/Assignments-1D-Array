package taking_Input;

import java.util.Scanner;

public class total_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int total_marks= a+b+c;
        int prec = total_marks/3;
        System.out.println("marks"+total_marks);
        System.out.println(prec+"%");
    }
}
