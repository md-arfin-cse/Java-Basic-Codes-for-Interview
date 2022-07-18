import java.util.Scanner;

public class User_Input_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your Name: ");
        String name = sc.next();
        System.out.println(" Enter your Age: ");
        int age = sc.nextInt();
        System.out.println(" Enter your Gender: ");
        char gender = sc.next().charAt(0);
        System.out.println(" Enter your Phone Number: ");
        long number = sc.nextLong();
        System.out.println("--------------------------------------");

        System.out.println(" Name: " +name);
        System.out.println(" Age: " +age);
        System.out.println(" Gender: " +gender);
        System.out.println(" Phone Number: " +number);
    }
}

