/*
logic:

area = side * side
area = width * height

Area of Square will be calculated as :
    area = side* side
    since , width = height
 */

import java.util.Scanner;

public class AreaofSquare_26 {
    public static void main(String[] args) {
        int side, area;
        System.out.println(" Enter the side of Square ");
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        area = side * side;

        System.out.println("Area of square: " +area);
    }
}
