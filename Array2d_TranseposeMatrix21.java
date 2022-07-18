import java.util.Scanner;

public class Array2d_TranseposeMatrix21 {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arrays Data: ");
        for (int i = 0; i <=1 ; i++) { //row
            for (int j = 0; j <=1 ; j++) { //col
                a[i][j] = sc.nextInt();

            }

        }
        System.out.println("Arrays Matrix: ");
        for (int i = 0; i <=1 ; i++) { //row
            for (int j = 0; j <=1 ; j++) { //col
                System.out.print(a[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i <=1 ; i++) { //row
            for (int j = 0; j <=1 ; j++) { //col
                System.out.print(a[j][i]+" ");

            }
            System.out.println();

        }
    }
}

/*
Enter Arrays Data:
10 20 30 40
Arrays Matrix:
10 20
30 40
Transpose Matrix:
10 30
20 40
 */