public class Print_all_prime_num {
    public static void main(String[] args) {
        int temp = 0;

        for (int no = 1; no<=100; no++){
               for (int i = 2; i<=no - 1; i++){
                 if (no%i==0){
                    temp = temp+1;
                }
            }
            if (temp==0){
                System.out.println(no);
            }
            else {
                temp=0;
            }
        }
    }
}
