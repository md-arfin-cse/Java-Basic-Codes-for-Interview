import java.util.Scanner;
public class Arrays_length_3 {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Enter Elements in Arrays: ");
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
            System.out.println(a[i] + " ");
        }
        System.out.println("Array Length: " +a.length);
    }
}
