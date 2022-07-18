
/*

logic: input: 3465

o/p---> 4
 */


import java.util.Scanner;

public class CountNumberOfDigits_19 {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter any Number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n>0){
            n = n/10;
            count++;
        }
        System.out.println("No. of Digits: " +count);
    }
}
