import java.util.Scanner;

public class DivisibleBy5_33 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        n =sc.nextInt();

        if (n%5 == 0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not Divisible by 5");
        }

    }
}
