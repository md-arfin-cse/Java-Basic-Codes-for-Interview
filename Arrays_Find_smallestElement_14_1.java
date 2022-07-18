import java.util.Scanner;

public class Arrays_Find_smallestElement_14_1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arrays Elements: ");
        for (int i= 0; i<a.length; i++ ){
            a[i] = sc.nextInt();
        }
        min = a[0];
        for (int i =1; i<a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
            System.out.println("Smallest Element is: " + min);

        }
    }

    /*
Enter Arrays Elements:
10 20 30  40 50
Smallest Element is: 10

     */