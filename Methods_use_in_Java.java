import java.util.Scanner;

public class Methods_use_in_Java {
    int n1,n2;
    int add,sub,mul,div,rem;
    public static void main(String[] args) {
        Methods_use_in_Java ref = new Methods_use_in_Java();
        ref.input();
        ref.process();
        ref.output();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }
    void process(){
        add = n1 + n2;
        sub = n1 - n2;
        mul = n1 * n2;
        div = n1 / n2;
        rem = n1 % n2;
    }
    void output(){
        System.out.println("add of two numbers: " +add);
        System.out.println("sub of two numbers: " +sub);
        System.out.println("mul of two numbers: " +mul);
        System.out.println("div of two numbers: " +div);
        System.out.println("rem of two numbers: " +rem);
    }
}

/*
Enter two Numbers:
8 4
add of two numbers: 12
sub of two numbers: 4
mul of two numbers: 32
div of two numbers: 2
rem of two numbers: 0

 */