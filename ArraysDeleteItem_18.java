import java.util.Scanner;

public class ArraysDeleteItem_18 {
    public static void main(String[] args) {
        int size,loc,i;

        System.out.println("Enter the array size: ");
        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the array Elements: ");
        for (i = 0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter array locations Deleting: ");
        loc = sc.nextInt();
        for (i=loc; i<size-1; i++){
            a[i] = a[i+1];

        }
        size--;
        for (i=0; i<size;i++){
            System.out.println(a[i]+ " ");
        }
    }
}

/*
Enter the array size:
5
Enter the array Elements:
1 2 3 4 5
Enter array locations Deleting:
3
1
2
3
5

 */