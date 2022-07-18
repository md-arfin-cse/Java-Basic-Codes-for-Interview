import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
//        int table = 2;

//        for (int i = 1; i<=10; i++){
//            System.out.println(table*i);
//        }

        //logic2
//
//        for (int i = 1; i<=10; i++){
//            System.out.println(table+ "X" + i + "=" + table*i);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to Print Table:");

        int table = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(table+ "X" + i + "=" + table*i);
        }
    }
}
