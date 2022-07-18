import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayElementsUsingArrayClassMethods_2 {
    public static void main(String[] args) {
        String a[] = {"Core" , "Java","Key-path","Education"};
        //1d 1. toString() 2.asList()
        System.out.println("toString() =  " + Arrays.toString(a));
        System.out.println("asList() =  " + Arrays.asList(a));

        //2d deepToString()
        int arr [][] = {{10,20},{30,40}};
        System.out.println("deepToString() = " + Arrays.deepToString(arr));
    }
}
