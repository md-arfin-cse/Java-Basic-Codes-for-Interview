/*

input first num= 10
input second num= 20
o/p:
prime numbers: 11 13 17 19

 */


import java.util.Scanner;

public class PrintAllPrimeNumBetweenTwoNums_43 {
    public static void main(String[] args) {
        int n1 ,n2,i,j;
        System.out.println("Enter any Number:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (i = n1; i<=n2; i++){
            for ( j = 2; j<=i; j++){
                if (i%j==0)
                    break;
            }
            if (i==j){
                System.out.print(j+" ");
            }
        }
    }
}
