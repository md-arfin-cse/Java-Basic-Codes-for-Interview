
/*
logic

Input Num= 7 is priome num -->  Jo only 1 and 7 se div ho.
           4 is not prime num
 */


import java.util.Scanner;

public class PrimeNum_41 {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 1; i<= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if (count==2){
                System.out.println("Prime Number");
            }
            else {
                System.out.println("Not a Prime number");
            }
        }
    }

