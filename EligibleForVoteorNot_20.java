
/*
Logic:

input age >= 18 Greater than Eligible
input age <= 18 Smaller than not Eligible

 */



import java.util.Scanner;

public class EligibleForVoteorNot_20 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age>=18){
            System.out.println("Eligible for vote!");
        }
        else {
            System.out.println("Not Eligible for vote!");
        }
    }
}
