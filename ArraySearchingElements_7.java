/*
Logic:

a[5] = 10 20 30 40 50
Search item = 50  --> item found
Search item = 80  --> item not found
 */
import java.util.Scanner;

public class ArraySearchingElements_7 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int n, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Arrays:");

        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements: ");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + " ");

        }
        System.out.println("Enter Searching the Elements: ");
        n = sc.nextInt();
        for (int i =0; i<a.length; i++){
            if(a[i] == n){
                count++;
            }
        }
        if (count>0)
            System.out.println("Item Found");
        else
            System.out.println("Item Not found");
    }
}

/*

Enter Elements in Arrays:
1 2 3 5 6
Array elements:
1
2
3
5
6
Enter Searching the Elements:
5
Item Found
 */