import java.util.Arrays;
import java.util.Scanner;

public class Array_PredefinedSTATIC_CopyMethods_13 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data in Arrays: ");
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int a2 [] = Arrays.copyOf(a,6);
        a2 [5] = 100;
        System.out.println("Data in Arrays2: ");
        for (int i = 0; i<a2.length; i++){
            System.out.println(a2[i] + " ");
        }

    }
}


/*
Enter the Data in Arrays:
10 20 30 40 50
Data in Arrays2:
10
20
30
40
50
100 //copy

Process finished with exit code 0

 */