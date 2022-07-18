/*
logic:

input num 121 -> 121
input num 191 -> 191

 */


import java.util.Scanner;

public class PallindromeNum_39 {
    public static void main(String[] args) {
        int n , s=0, c ,r ;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();

        c =n;
        while (n>0){
            r = n%10;
            s = (s*10)+r;
            n=n/10;
        }
        if (c==s){
            System.out.println("Palindrome Number ");
        }
        else {
            System.out.println("Not a palindrome Number");
        }
    }
}
