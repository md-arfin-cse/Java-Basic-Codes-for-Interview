import java.util.Scanner;

public class Print_an_Integer_using_Scanner {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("You Entered Number : " + num);
    }
}
