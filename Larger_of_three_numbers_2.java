//WAP to find the largest of three numbers

//public class Larger_of_three_numbers_2 {
//    public static void main(String[] args) {
//        int a = 40, b = 60, c = 80;
//        if (a > b)
//        {
//            if (a > c) {
//                System.out.println("a is greater");
//            } else {
//                System.out.println("c is greater");
//            }
//             else if (b > c)
//             {
//                System.out.println("b is greater");
//            } else
//            {
//                System.out.println("c is greater");
//            }
//        }
//    }
//}
//





public class Larger_of_three_numbers_2 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a>b && a>c)
        {
            System.out.println("a is greater");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }

    }
}
