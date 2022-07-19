import java.util.Scanner;

public class AvgMarksOf5Subject_17 {
    public static void main(String[] args) {
        int a,b,c,d,e;

        System.out.println("Enter marks of 5 Subjects: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        int sum = a+b+c+d+e;

        System.out.println("Total Marks: " +sum);

        double avg = sum/5.0;
        System.out.println(" Avg Marks " +avg);
    }
}


/*
Enter marks of 5 Subjects: 
78 94 65 32 68
Total Marks: 337
 Avg Marks 67.4
*/
