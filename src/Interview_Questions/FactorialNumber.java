package Interview_Questions;

public class FactorialNumber {
    public static void main(String[] args) {
        factorial(5);
}
    public static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            // fact*=i;
        }
        System.out.println("The Result of the Factorial= " + fact);
    }
}