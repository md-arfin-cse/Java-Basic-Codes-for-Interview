// logic = 5432  ans = 2345

// 10 / 5432 rem = 3


public class Reverse_Number {
    public static void main(String[] args) {
        int no = 5432;
        int rem = 0, rev = 0;

        while (no!=0 )
        {
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no/10;
        }
        System.out.println(rev);

    }
}
