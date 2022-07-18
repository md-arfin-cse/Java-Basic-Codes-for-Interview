import java.util.Scanner;

public class ArrayElementsInReverseOrder_4 {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Arrays Elements: ");
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
            System.out.println(a[i] + " ");
        }
        System.out.println("Arrays Reverse Elements: ");
        for (int i = a.length-1; i>=0; i--){
            System.out.println(a[i] + " ");
        }
    }
}
