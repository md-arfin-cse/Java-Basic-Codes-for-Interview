import java.util.Scanner;

public class Add_three_num_user_input_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int a,b,c, sum;

        System.out.println("Enter the Number:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sum = a+b+c;

        System.out.println("Addition of three Numbers: " +sum);
    }
}

/*
Enter the Number:
8
5
5
Addition of three Numbers: 18
45
 */