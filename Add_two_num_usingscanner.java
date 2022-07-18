import java.util.Scanner;

public class Add_two_num_usingscanner {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        System.out.println("Enter the Two Numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;

        System.out.println("Addition of Two numbers: " + sum);

    }
}
