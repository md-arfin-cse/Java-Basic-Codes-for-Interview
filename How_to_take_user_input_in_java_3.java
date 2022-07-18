import java.util.Scanner;

public class How_to_take_user_input_in_java_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");

        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();


        System.out.println(a+ " " +b);

    }
}
