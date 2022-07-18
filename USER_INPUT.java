import java.util.Scanner;

public class USER_INPUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Please Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Your age is: "+age);

        System.out.println("Please Enter your Name:");
        sc.nextLine();
        String name =  sc.nextLine();
        System.out.println("Your name is : "+name);

        System.out.println("Enter your Salary:");
        double sal = sc.nextDouble();
        System.out.println("Your Salary is : "+sal);

        System.out.println("Enter your Student Salary:");
        float stud = sc.nextFloat();
        System.out.println("Your Student Salary is : "+stud);

    }
}
