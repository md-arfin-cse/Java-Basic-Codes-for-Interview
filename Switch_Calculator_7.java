import java.util.Scanner;

public class Switch_Calculator_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int no1= sc.nextInt();
        System.out.println("Enter the Second Number:");
        int no2 = sc.nextInt();


        System.out.println("Select Symbol(+,-,*,/)");
        String symbol = sc.next();

        int res;

        switch (symbol)
        {
            case "+": res = no1 + no2;
                System.out.println("Addition is : "+res);
                break;

            case "-": res = no1 - no2;
                System.out.println("Subtractions is : "+res);
                break;

            case "*": res = no1 * no2;
                System.out.println("Multiplication is : "+res);
                break;

            case "/": res = no1 / no2;
                System.out.println("Division is : "+res);
                break;

            default:
                System.out.println("Invalid Symbol");
        }

    }
}
