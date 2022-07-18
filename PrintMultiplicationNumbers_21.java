import java.util.Scanner;

public class PrintMultiplicationNumbers_21 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any NUmber: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i<=10; i++ ){

            System.out.println(n + "X" +i+ "=" + n * i);
        }

    }
}
