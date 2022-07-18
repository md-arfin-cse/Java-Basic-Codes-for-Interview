
//Logic: 5! = 5*4*3*2*1 = 120

public class Factorial {
    public static void main(String[] args) {

        int num = 5; int facto = 1;

        for (int i = 1; i<=num; i++){
            facto = facto * i ;
        }
        System.out.println(facto);

//        for (int i = num; i>=1; i--){
//            facto = facto * i;
//        }
//        System.out.println(facto);

    }
}
