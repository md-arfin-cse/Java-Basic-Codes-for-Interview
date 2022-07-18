import java.util.Scanner;

public class Array2d_sumOfMatrix_20 {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Matrix Data: ");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter Second Matrix Data: ");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();

            }
        }
        System.out.println("First Matrix:   ");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("First Second :   ");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("Sum of Matrix: ");
        for (int i = 0; i<2; i++){
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+b[i][j] + " ");

            }
            System.out.println();
        }

    }
}

/*
Enter First Matrix Data:
10 20 30 40
Enter Second Matrix Data:
10 20 30 40
First Matrix:
10 20
30 40
First Second :
10 20
30 40
Sum of Matrix:
30 60
90 120

 */