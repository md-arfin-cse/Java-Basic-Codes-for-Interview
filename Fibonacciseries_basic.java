
/*
logic:

0,1,1,2,3,5,8,13

jo previous num ka sum hota hai

ex:  0+1+1+2+3+5+7+9

*/

public class Fibonacciseries_basic {
    public static void main(String[] args) {
        int a = 0 , b =1;
        System.out.print(a+" "+b);

        int c;
        for (int i =1; i<=10;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}

