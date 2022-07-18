public class StaticVSNoStatic {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        StaticVSNoStatic R = new StaticVSNoStatic();
        R.Disp();
        StaticVSNoStatic.Show();

    }
    static void Show()
    {
        System.out.println("show(): " +b);
    }
    void Disp()
    {
        System.out.println("Disp(): "+a+" "+b);
    }


}
