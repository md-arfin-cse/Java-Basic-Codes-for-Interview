import java.util.Scanner;

public class SwappingofTwoNumWithoutUsingThirdVar_29 {
    public static void main(String[] args) {
        int a , b;
        System.out.println("Enter any two numbers: ");
        Scanner sc = new Scanner(System.in); // 4 2
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(" Before Swapping " +a+ " " + b);

        a = a +b; // 4 + 2 = 6
        b = a - b; // 6 - 4 = 2
        a = a-b; //6 - 2 = 4

        System.out.println(" After Swapping " +a+ " " +b);
    }
}
