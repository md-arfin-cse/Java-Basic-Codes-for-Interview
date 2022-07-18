import java.util.Scanner;

public class Arrays_Sorting_elements_AscendingOrder_9 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int temp;
        System.out.println("Enter the element in arrays: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            a[i] = sc.nextInt();
        }
        for (int i =0; i<5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorting Elements in Ascending order: ");
        for (int i = 0; i<5;i++){
            System.out.println(a[i] +"");
        }
    }
}

/*
Enter the element in arrays:
10 40 8 5 9
Sorting Elements in Ascending order:
5
8
9
10
40
*/
