import java.util.Scanner;

public class AVG_marks_user_scanner {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.println("Enter marks of 5 Subjects:");
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         d = sc.nextInt();
         e = sc.nextInt();

        int sum = (a+b+c+d+e);
        System.out.println(" Total marks " + sum);
        double avg = sum/5.0;
        System.out.println(" AVG MARKS " +avg);
    }
}
