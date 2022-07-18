/*

logic:
input num = 153 =(1*1*1+5*5*5+3*3*3)= 153 armstrong number

152 not armstrong
 */



import java.util.Scanner;

public class ArmstrongNum_40 {
    public static void main(String[] args) {
        int n,c,rem,arm = 0;
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;

        while (n>0){
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n =n/10;

        }
        if (c==arm)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
