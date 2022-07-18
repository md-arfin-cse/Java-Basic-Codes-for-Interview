
// i/p = 123
// o/p = 321

import java.util.Scanner;

public class Reverse_num_37 {


    public static void main(String[] args) {
        int n,r;
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n>0){
            r = n % 10;
            System.out.print("Reverse order "+r);
            n = n/10;


        }


    }
}
