import java.util.Scanner;

public class Array_copy_Elements_5 {
    public static void main(String[] args) {
        int a [] = new int[5];
        int b [] = new int[5];
        int c [] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println(" Arrays Elements: ");
        for (int i = 0; i<5; i++){
            a[i] = sc.nextInt();
            System.out.println(a[i] + " ");
        }
        System.out.println("Copying Array Elements: ");
        for (int i =0; i<5; i++){
            b[i] = a[i];
            System.out.println(a[i] + " ");

        }
        System.out.println("Copying Array Elements: ");
        for (int i =0; i<5; i++){
            b[i] = a[i] = c[i];
            System.out.println(a[i] + " ");

        }
    }
}
