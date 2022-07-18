public class Check_for_LeapYear {
    public static void main(String[] args) {
        int year = 2022;
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


//        if ((year % 400 == 0) || (year % 4 ==0 && year % 100!=0)){
//            System.out.println("Leap year");
//        }
//        else{
//            System.out.println("Not Leap Year");
//        }
//
//    }
//}
//

