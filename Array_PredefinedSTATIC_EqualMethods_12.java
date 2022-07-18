import java.util.Arrays;
import java.util.Scanner;

public class Array_PredefinedSTATIC_EqualMethods_12 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int a2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data in Arrays: ");
        for (int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
         System.out.println("Enter Data in Arrays2: ");
        for (int i =0; i<a.length; i++){
            a2[i] = sc.nextInt();
        }
        boolean b = Arrays.equals(a,a2);
        System.out.println("Kya dono Arrays Equal hai: " +b);

    }

}


/*
Enter Data in Arrays:
10 20 30 40 50
Enter Data in Arrays2:
10 20 30 40 50
Kya dono Arrays Equal hai: true




Enter Data in Arrays:
10 20 58 47 9
Enter Data in Arrays2:
45 78 9 65 12
Kya dono Arrays Equal hai: false

 */