import java.util.Scanner;

public class Arrays_Sorting_elements_DescendingOrder_10 {
    public static void main(String[] args) {

            int a[] = new int[5];
            int temp;
            System.out.println("Enter the element in arrays: ");
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i<a.length; i++){
                a[i] = sc.nextInt();
            }
            for (int i =0; i<a.length; i++) {
                for (int j = i + 1; j <a.length; j++) {
                    if (a[i] < a[j]) { //descending //swapping
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.println("Sorting Elements in Descending order: ");
            for (int i = 0; i<a.length;i++){
                System.out.println(a[i] + " ");
            }
    }
}

/*

Enter the element in arrays:
34 36 78 25 4
Sorting Elements in Descending order:
78
36
34
25
4

 */