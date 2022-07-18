import java.util.Scanner;

public class Sum_of_Array_Elements {
    public static void main(String[] args) {
        int a [] = new int[5]; int sum =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elements in arrays");
        for (int i = 0; i<5; i++){
            a[i] = sc.nextInt();

        }
        System.out.println("Array Elements");
        for (int i = 0; i<5; i++){
            System.out.println(a[i] + " ");
            sum = a[i] + sum;

        }
        System.out.println(" Addition of Array Elements is " + sum);

    }
}
