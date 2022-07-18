// LOGIC:: I/P -= 10 --> 1 2 5 10   jO 10 SE DIVIDE HO JAYE

import java.util.Scanner;

public class Factor_of_num_jo10sedivHoJaye_35 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
