import java.util.Scanner;

public class Print_PowerOfaNumber15 {
    public static void main(String[] args) {
        int n,p,result=1;

        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter Power: ");
        p = sc.nextInt();

        for (int i =1; i<=p; i++){
            result = n * result;
        }
        System.out.println(" Power is: " + result);
    }
}
