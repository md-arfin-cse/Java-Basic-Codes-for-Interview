public class String_Methods2 {
    public static void main(String[] args) {
        String a = "Arfin";
        String b = "Ankit";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

//        System.out.println(b.concat());
        System.out.println(b.length());

        String c =  "     Ankur    ";
        String d = "Learn";

        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(b.charAt(2));
        System.out.println(a.indent('k'));

        System.out.println(b.equals(a));
        System.out.println(d.replace('r','e'));
    }
}
