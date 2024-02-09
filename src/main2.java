import java.util.Enumeration;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("I am main 2 class");
        }
    }
}
