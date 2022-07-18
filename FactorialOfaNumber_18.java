
/*

5! = s* 4*3*2*1 = 120
 */

import java.util.Scanner;

public class FactorialOfaNumber_18 {
    public static void main(String[] args) {
        int n, fact = 1;

        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            fact = fact *i ;

        }
        System.out.println("factorial " +fact);
    }
}
