import java.util.Scanner;

public class Tax_Calculation {
    public static void main(String[] args) {
        int sal;
        System.out.println("Enter Salary:");
        Scanner sc = new Scanner(System.in);
        sal = sc.nextInt();


        double tax;

        if (sal <=10000){
            System.out.println(sal + "No tax");

        }
        else if (sal > 10000 && sal<=100000)
        {
            tax=sal*0.10;
            System.out.println(sal+ " "+tax);
        }
        else{
            tax=sal*0.20;
            System.out.println(sal + " "+tax);
        }


    }
}
