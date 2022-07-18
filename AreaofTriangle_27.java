
/*

logic:
input a b c
find semi perimeter //sp
area of triangle
 */


import java.util.Scanner;

public class AreaofTriangle_27 {
    public static void main(String[] args) {
        int a,b,c,sp ;
        double area;

        System.out.println("Enter the value of side of Triangles: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();

        sp = (a + b + c ) /2;
        area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of Triangle: " + area);




    }
}
