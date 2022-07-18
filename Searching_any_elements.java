import java.util.Scanner;

public class Searching_any_elements {
    public static void main(String[] args) {
        int[] a = new int[5];
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for (int j : a) {
            System.out.println(j + " ");
        }
        System.out.println("Array Elements");
        n = sc.nextInt();
        for (int j : a) {
            if (j == n) {
                count++;

            }
        }

        if (count > 0) {
            System.out.println(" Item found " + count + " times ");
        } else {
            System.out.println("not found");
        }
    }
}



