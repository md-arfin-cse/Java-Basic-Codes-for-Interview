/*

logic 100 200
      200 100 ans
 */


import java.util.Scanner;

public class SwapTwoNumbers_28 {
    public static void main(String[] args) {
        int a , b , temp;
        System.out.println("Enter the two Numbers: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before swapping: " +a+ " " +b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: " +a+ " " +b);
    }
}
