package Interview_Questions;

public class PrimeNumbers {
    public static void main(String[] args) {
      //  System.out.println(checkPrimeNumber(11));
      checkPrimeNumbers2(7);
    }
    //prime number with with return
    public static boolean checkPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //prime number with without return
    public static void checkPrimeNumbers2(int n){
        boolean prime = true;
        for (int i=2; i<n; i++)
            if (n%i==0){
                prime=false;
                break;
            }
        System.out.println(n);
        System.out.println(prime);
    }
}

