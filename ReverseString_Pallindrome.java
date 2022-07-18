public class ReverseString_Pallindrome {
    public static void main(String[] args) {
        String n = "madam"; //pallindrome
//        String n = "mada"; // not a pallindrome


        String rev = "";

        for (int i = n.length()-1; i>=0; i--){
            rev = rev + n.charAt(i);
        }
        if (n.equals  (rev)){
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not a Palindrome String");
        }
    }
}
