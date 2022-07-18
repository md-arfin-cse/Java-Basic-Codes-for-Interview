import java.util.Scanner;

public class ArraySumElements_6 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Arrays: ");

        for (int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements: ");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]+ " ");
            sum = a[i] + sum;
        }
        System.out.println("Addition of Arrays Elements: " +sum);
    }
}


   /* Enter Elements in Arrays:
        10 20 30 40 50
        Array Elements:
        10
        20
        30
        40
        50
        Addition of Arrays Elements: 150

        Process finished with exit code 0

    */
