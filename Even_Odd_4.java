
/*
logic : Jo 2 se div ho jaye wo even
        jo 2 se div nhi ho wo odd

 */


import java.util.Scanner;


public class Even_Odd_4 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");

        n = sc.nextInt();

        if(n % 2 ==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }

    }
}
