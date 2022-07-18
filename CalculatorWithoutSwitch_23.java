import java.util.Scanner;

public class CalculatorWithoutSwitch_23 {
    public static void main(String[] args) {
        int n1 , n2, ch , cal ;  //ch- choice cal-->calculation

        System.out.println(" Enter two Numbers: ");
        Scanner sc =  new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println(" Select the Operations: ");
        ch = sc.nextInt();


        if (ch == 1){
            cal = n1 + n2;
            System.out.println(" Addition " + cal);
        }
        else if (ch == 2){
            cal = n1 - n2;
            System.out.println(" Subtraction " + cal);
        }

        else if (ch == 3){
            cal = n1 * n2;
            System.out.println(" Multiplication " + cal);
        }

        else if (ch == 4){
            cal = n1 / n2;
            System.out.println(" Division " + cal);
        }
        else {
            cal = n1 % n2;
            System.out.println(" Reminder " + cal);

        }

    }
}
