public class Swap_two_num_without_any_var {
    public static void main(String[] args) {
        int a = 10, b =20;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" a : " +a);
        System.out.println(" b : " +b);
    }
}
