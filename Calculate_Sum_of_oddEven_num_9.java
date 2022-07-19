/*

logic:
Even: 10 --->  (0+2+4+6+8+10)=30
Odd: 11 --->  (1+3+5+7+9+11)=36
 */

import java.util.Scanner;

public class Calculate_Sum_of_oddEven_num_9 {
    public static void main(String[] args) {
        int n,i, Sum=0;
        System.out.println("Enter Range: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        if (n % 2 ==0){
           for ( i = 0; i<=n; i= i+2){
               Sum = Sum + i;
           }
            System.out.println("Sum of Even no " + Sum);
        }
        else{
            for ( i = 1; i<=n;  i= i+2){
                Sum = Sum + i;

            }
            System.out.println("Sum of Odd no " + Sum);
        }
    }
}


// Enter Range: 
// 10
// Sum of Even no 30


// Enter Range: 
// 11
// Sum of Odd no 36

