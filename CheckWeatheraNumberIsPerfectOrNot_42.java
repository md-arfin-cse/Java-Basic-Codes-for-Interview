
/*

logic:

Input num = 6 --->  123456
            6 ---> 1+2+3=6

            this is prefect num
 5 ---> 12345
      notperfect num



 */

import java.util.Scanner;

public class CheckWeatheraNumberIsPerfectOrNot_42 {
    public static void main(String[] args) {
        int n, sum=0;
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        for (int i = 1; i<n; i++){
            if (n%i==0){
                sum=sum+i;
            }
        }
        if (n==sum){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");

        }
    }
}
