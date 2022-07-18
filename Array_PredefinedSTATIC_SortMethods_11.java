import java.util.Arrays;
import java.util.Scanner;

public class Array_PredefinedSTATIC_SortMethods_11 {
    public static void main(String[] args) {
        int a[] =  new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data in Arrays: ");

        //sort() methods
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("SORT(): ");
        Arrays.sort(a);
        for (int i =0 ; i<a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
}

/*
Enter Data in Arrays:
10 5 78 5 6
SORT():
5
5
6
10
78
 */
