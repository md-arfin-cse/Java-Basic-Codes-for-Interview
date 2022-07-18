public class Reverse_a_string {
    public static void main(String[] args) {
        String name = "arfin";

        String rev = " ";

        for (int i = name.length()-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
