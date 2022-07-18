public class Swap_Two_Number_using_third_var_5 {
    public static void main(String[] args) {
        int a = 10, b = 20;

//        int t;
//         t = a;
//         a = b;
//         b = t;
//
//        System.out.println("a : "+a);
//        System.out.println("b : "+b);
//
//
//
//    }
//}

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}

