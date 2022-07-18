/*
logic: Area of Rectangle
ip - length
ip - breadth

formula  area = l * b  ans

 */



import java.util.Scanner;

public class AreaOfRectangle_24 {
    public static void main(String[] args) {
        int l , b , area;

        System.out.println("Enter the value of both sides: ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        area = l * b;

        System.out.println("Area of Rectangle: " + area);
    }
}
