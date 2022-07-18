import java.util.Scanner;

public class Arrays_Find_biggestElement_14 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements: ");
        for (int i = 0 ; i<a.length; i++){
            a[i] = sc.nextInt();

        }
        max = a[0];
        for (int i = 1; i<a.length;i++){
            if (a[i]>max){

            }
            max = a[i];
        }
        System.out.println("Biggest Element is: " +max);
    }
}

/*
Enter the Array Elements:
10
20
30
40
50
Biggest Element is: 50

 */