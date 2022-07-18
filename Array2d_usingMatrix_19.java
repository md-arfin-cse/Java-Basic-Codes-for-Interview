import java.util.Scanner;

public class Array2d_usingMatrix_19 {
    public static void main(String[] args) {
        int a[][] =  new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrays elements: ");
        for (int i =0; i<2; i++){//rows
            for (int j =0; j<2; j++){//col
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i <2 ; i++) {//rows
            for (int j = 0; j < 2; j++) {//col
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }


        }
    }

/*
Enter the arrays elements:
10 20 30 40
Matrix:
10 20
30 40
 */