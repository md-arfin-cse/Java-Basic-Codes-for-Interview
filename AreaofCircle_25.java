/*

logic : Area of Circle = PI*r*r
        PI = 22/7 OR 3.14


        IP -- AREA OF CIRCLE = 4
              ANS = 50.24


 */

import java.util.Scanner;

public class AreaofCircle_25 {
    public static void main(String[] args) {
        final  double PI = 3.14, area;
        int r;
        System.out.println(" Enter the Radius of Circle: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        area = PI * r * r ;

        System.out.println(" Area of Circle " +area);
    }
}
