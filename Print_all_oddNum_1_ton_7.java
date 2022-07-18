/*
Logic:
odd-  1 to n loop
even- 0 to n loop
 */

import java.util.Scanner;

public class Print_all_oddNum_1_ton_7 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number of Term: ");

        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();

        //Odd

//        for (int i =1; i<=n; i= i+2){
//            System.out.println(i + " ");
//        }

        //even

        for (int i =0; i<=n; i= i+2){
            System.out.println(i + " ");
        }
    }
}
