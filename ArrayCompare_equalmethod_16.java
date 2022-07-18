import java.util.Arrays;

public class ArrayCompare_equalmethod_16 {
    public static void main(String[] args) {
        int a []= {10, 20, 30, 40, 50};
        int b[] = {10,20,30,40,50};

        if (Arrays.equals(a,b)){
            System.out.println("Both are equals");
        }
        else
            System.out.println("Both are not equals");
    }
}

/*

== --> isme equal nhi hoga
equal() --> Isme equal hoga


o/p --->Both are equals
 */