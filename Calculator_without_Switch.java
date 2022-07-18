import java.util.Scanner;

public class Calculator_without_Switch {
    public static void main(String[] args) {
        int n1,n2,ch,cal;
        System.out.println("Enter your Number:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Select Operation");
        ch = sc.nextInt(); //ch - choice

        if (ch==1){
            cal = n1+ n2;
            System.out.println("ADDITION "+cal);
        } else if (ch==2) {
            cal = n1 - n2;
            System.out.println("SUBTRACTION "+cal);

        } else if (ch==3) {
            cal = n1 * n2;
            System.out.println("MULTIPLICATION "+cal);

        } else if (ch==4) {
            cal = n1/n2;
            System.out.println("DIVISION "+cal);

        }
        else {
            cal=n1%n2;
            System.out.println("REMAINDER "+cal);

        }


    }
}
