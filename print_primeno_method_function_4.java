public class print_primeno_method_function_4 {
    static void checkPrime(int n ){
        int i , m = 0, flag= 0;
                m = n/2;
        if (n==0||n==1) {
            System.out.println(n + "is not prime number");
        } else{
            for (i = 2; i<=m; i++){
                if (n%i==0){
                    System.out.println(n+"is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+ "is prime number");
            }
        }
    }
    public static void main(String[] args) {
        checkPrime(1);
        checkPrime(10);
        checkPrime(13);
        checkPrime(45);

    }
}




/*
o/p-
1is not prime number
10is not prime number
13is prime number
45is not prime number
 
*/
