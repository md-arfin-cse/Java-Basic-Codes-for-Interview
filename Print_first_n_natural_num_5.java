/*
Logic: N natural number program

ex: user jaha tak chahe waha tak number print kara sakta hai

for ex: 100

1 se 100 tak print hoga


 */




import java.util.Scanner;

public class Print_first_n_natural_num_5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number of term:");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println(i);
//            System.out.println(i+ "");
        }


    }
}
