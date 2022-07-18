import java.util.Scanner;

public class Talble_Print_UsingForloop_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Multiplication Table:");
        int multiply = sc.nextInt();

        for (int i = 1; i<=11; i++){
            System.out.println(multiply+"*"+i+" = "+multiply*i);
        }
    }
}
