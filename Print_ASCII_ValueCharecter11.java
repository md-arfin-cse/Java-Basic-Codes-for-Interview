import java.util.Scanner;

public class Print_ASCII_ValueCharecter11 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any Character: ");
        Scanner sc = new Scanner(System.in);
        ch =  sc.next().charAt(0);

        int a = ch;

        System.out.println("ASCII Value of " + ch + " is " +a);
    }
}
