/*

logic: input charAt(2) - arfin
o/p----  arfin---
         01234

         output - f
 */


import java.util.Scanner;

public class print_toTakeCharector_inputFromUser_10 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please Enter Character: ");
        Scanner sc =new Scanner(System.in);
        ch = sc.next().charAt(2);
        System.out.println(ch);
    }
}
