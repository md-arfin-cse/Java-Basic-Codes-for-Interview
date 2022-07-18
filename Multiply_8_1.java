import java.util.Scanner;

public class Multiply_8_1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Table Number:");
        int mul = SC.nextInt();
//        int mul = 2;
        for (int i = 1; i<=10;i++){
            System.out.println(mul+" * "+i+" = "+mul*i);
        }

    }
}
