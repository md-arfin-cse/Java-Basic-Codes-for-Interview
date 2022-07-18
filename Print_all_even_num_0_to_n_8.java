/*

logic:  0 to n loop
 */

import java.util.Scanner;

public class Print_all_even_num_0_to_n_8 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of term: ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i =0; i<=n; i = i+2){
            System.out.println(i);
        }
    }
}
