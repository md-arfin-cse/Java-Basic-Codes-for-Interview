
/*

logic:
input a to z ---lowercase
input A TO Z ----Uppercase
 */



import java.util.Scanner;

public class Convert_CharecterLowertoUpperCase_30 {
    public static void main(String[] args) {
        char ch, ch2 = 0;

        System.out.println("Enter any character: ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0); // ch = 0
        if ( ch>'A' && ch<= 'Z' ){
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lower Case: " + ch2);
        }
        else{
            ch2 = Character.toUpperCase(ch);
            System.out.println("Upper case: " +ch2);
        }
    }
}
