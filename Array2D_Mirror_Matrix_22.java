import java.util.Scanner;

public class Array2D_Mirror_Matrix_22 {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Data: ");


        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Matrix: ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Mirror Matrix: ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 1; j >=0; j--) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();

        }

    }
}

/*
Enter the Array Data:
10 20 30 40
Array Matrix:
10 20
30 40
Mirror Matrix:
20 10
40 30

 */