import java.util.Scanner;

public class Array_FindAvgofSALaryElements_8 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Arrays Elements: ");
        for (int i = 0; i<5; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements: ");
        for (int i = 0; i<5; i++){
            System.out.println(a[i] + " ");

        }

         for (int i =0; i<5; i++) {
             sum = a[i] + sum;

         }
            avg = sum/5.0;
            System.out.println("Addition: " +sum+  "\nAverage: "   + avg);
        }

    }

/*
Enter the Arrays Elements:
10 20 30 40 50
Array Elements:
10
20
30
40
50
Addition: 150
Average: 30.0
 */