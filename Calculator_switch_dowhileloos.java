import java.util.Scanner;

public class Calculator_switch_dowhileloos {
    public static void main(String[] args) {
        String yn;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first Number:");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number:");
            int num2 = sc.nextInt();

            System.out.println("Select Symbol(+,-,*,/)");
            String symbol = sc.next();

            int result;
            switch (symbol) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Addition: " + result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println("Subtraction: " + result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println("Multiplication: " + result);
                    break;

                case "/":
                    result = num1 / num2;
                    System.out.println("Division: " + result);
                    break;

                default:
                    System.out.println("Invalid Symbol: ");
                    break;

            }
            System.out.println("Do you want to continue: ( Press y for Yes and n for No )");
            yn = sc.next();
        }
        while (yn.equals("y") || yn.equals("n"));
    }
}
