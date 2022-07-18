import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,S=0,c,r;

        System.out.println("Enter Any Number:");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        c=n;

        while (n>0){
            r = n%10;
            S=(S*10)+r; 
            n= n/10;
        }
        if (c==S){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }
    }
}
