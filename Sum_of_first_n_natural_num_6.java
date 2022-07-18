/*

logic: no - 6
      1 + 2 + 3 + 4+ 5+ 6= 21
 */


import java.util.Scanner;

public class Sum_of_first_n_natural_num_6 {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        System.out.println("EnTER NO OF TERMS: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Addition " + sum);
    }
}
