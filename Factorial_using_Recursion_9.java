import java.util.Scanner;

public class Factorial_using_Recursion_9 {
    static int fact = 1;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int no = sc.nextInt();


//        int no = 5;
        Factorial_using_Recursion_9 ob = new Factorial_using_Recursion_9();
        ob.calcFact(no);
        System.out.println("factorial of " + no + " is " + fact);
    }

    void calcFact(int no) {


        if (no >= 1) {
            fact = fact * no;
            calcFact(no - 1);
        }
    }
}
