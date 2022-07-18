
/*

logic: Jisko reverse karne pe same number aa ye

for ex: 535 - > 535
        121 -> 121
*/

import java.util.Scanner;

public class PallindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

//        int num = 153
        int temp = num;
        int rev = 0, rem;
        while (temp!=0){
            rem = temp % 10;
            rev = rev+10+rem;
            temp = temp/10;
        }
        if (num == rev){
            System.out.println(num+" is a palindrome number");
        }
        else{
            System.out.println(num+" is not a palindrome number");
        }
    }
}
