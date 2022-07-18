import java.util.Scanner;

public class Calculator_using_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();

        System.out.println("Select Symbol(+,-,*,/)");
        String symbol = sc.next();

        int result;

        switch (symbol){
            case "+" : result = num1 + num2;
                System.out.println("Addition: " +result);
            break;

            case "-" : result = num1 - num2;
                System.out.println("Subtraction: " +result);
            break;

            case "*" : result = num1 * num2;
                System.out.println("Multiplication: " +result);
            break;

            case "/" : result = num1 / num2;
                System.out.println("Division: " +result);
            break;

            default :
                System.out.println("Invalid Symbol: ");
                break;



        }
    }
}
