import java.util.Scanner;

public class Month_numand_days {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Months & No. of Days");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n==1){
            System.out.println("Jan");
        }
        else if (n == 2) {
            System.out.println("feb");
        }else if (n == 3) {
            System.out.println("MAR");
        }else if (n == 4) {
            System.out.println("APR");
        }else if (n == 5) {
            System.out.println("MAY");
        }else if (n == 6) {
            System.out.println("JUNE");
        }else if (n == 7) {
            System.out.println("JULY");
        }else if (n == 8) {
            System.out.println("AUG");
        }else if (n == 9) {
            System.out.println("SEPT");
        }else if (n == 10) {
            System.out.println("OCT");
        }else if (n == 11) {
            System.out.println("NOV");
        }else if (n == 12) {
            System.out.println("DEC");
        }
        else {
            System.out.println("Invalid");
        }

    }
}