//logic

/*

7 = 1*7 ->  Prime number

9 = 9*1 3*3 1*9 => Not a prime number

2,3,4,5,6

start with 2 in loop

*/

import java.util.Scanner;

public class PrimeNum_orNotPrime {
    public static void main(String[] args) {
//        int no = 7;
//        int temp = 0; //temporary
//
//        for (int i = 2; i<=no-1; i++ ){
//            if (no % i == 0){
//                temp = temp+1;
//            }
//
//        }
//        if (temp>0){
//            System.out.println("not a prime number");
//        }
//        else {
//            System.out.println("prime number");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int no = sc.nextInt();
        int temp = 0;

        for (int i = 2; i<=no-1; i++){
            if (no % i ==0){
                temp = temp+1;
            }
        }
        if (temp==0){
            System.out.println(no + " is prime number ");
        }
        else {
            System.out.println(no + " is not prime number ");
        }


    }
}
