/*

logic = 126 (1+2+6=9) ans
 */


import java.util.Scanner;

public class FindSumofDigits_38 {
    public static void main(String[] args) {
        int n, r, sum= 0;

        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();

        while (n>0){
            r = n%10;
            sum = sum +r;
            n= n/10;
        }
        System.out.println("Sum of Digits " +sum);
    }
}
