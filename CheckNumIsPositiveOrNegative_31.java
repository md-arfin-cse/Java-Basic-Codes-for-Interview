/*

logic:

input n>0 +ve number (greater than)
input n<0 -ve number (less than)
input n=0  Neither +ve nor -ve

 */



import java.util.Scanner;

public class CheckNumIsPositiveOrNegative_31 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();// ip 20

        if (n>0){
            System.out.println("Positive Number ");
        }
        else if(n<0){
            System.out.println("Negative Number ");
        }
        else {
            System.out.println("Neither positive or Nor Negative ");
        }
    }
}
