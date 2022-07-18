/*

logic :      Input sal <= 10000 ---> No tax
             Input sal >1000 b/w or (&& op - Both cond are true hona chaiye)
                   sal <= 100000 --> 10% Tax
             Input Sal > 100000 --> 20% tAX

 */

import java.util.Scanner;

public class CalculateTaxOfSalary_22 {
    public static void main(String[] args) {
        int sal;
        System.out.println("Enter the Salary: ");
        Scanner sc = new Scanner(System.in);
        sal = sc.nextInt();

        double tax;

        if (sal <= 10000){
            System.out.println(sal + " No Tax ");
        }
        else if (sal > 10000 && sal<=100000){
            tax = sal * 0.10;
            System.out.println(sal + " " +tax);
        }
        else {
            tax = sal * 0.20;
            System.out.println(sal + " " +tax);

        }
    }
}
