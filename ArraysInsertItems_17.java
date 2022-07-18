import java.util.Scanner;

public class ArraysInsertItems_17 {
    public static void main(String[] args) {
        int size, loc, item,i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        size = sc.nextInt();
        int a[] = new int[5];
        System.out.println("Enter Array Elements: ");
        for (i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Arrays location: ");
        loc = sc.nextInt();
        System.out.println("Enter new Item inserting: ");
        item = sc.nextInt();
        for (i = size; i<loc; i--){
            a[i] = a[i-1];
        }
        a[loc] = item;
        size++;
        for (i = 0; i<size; i++){
            System.out.println(a[i] + " ");
        }
    }
}

/*
Enter Array Size:
5
Enter Array Elements:
10 20 30 40 50
Enter Arrays location:
1
Enter new Item inserting:
100
10
100
30
40
50
 */