import java.util.Scanner;

public class Check_for_leapyear_4 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the year:");
//        int year = 2016;
        int year  = SC.nextInt();

//        if ( (year % 400 == 0) ||(year % 4 == 0 && year % 100!= 0) )
//        {
//            System.out.println("leap year");
//        }
//        else{
//            System.out.println("Not a leap year ");
//        }
//    }
//}

        if (year%4==0)
        {
            if (year%100==0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("not a Leap Year");
                }
            }
                else
                {
                    System.out.println("Leap year");
                }
            }
                else
                {
                    System.out.println("not a leap year");
                }

            }

        }



