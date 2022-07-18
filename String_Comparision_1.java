public class String_Comparision_1 {
    public static void main(String[] args) {
        String a = "Lion";
        String b = new String("Lion");


        //true
//        if (a.equals(b)){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }

        //false
        if (a==b){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
