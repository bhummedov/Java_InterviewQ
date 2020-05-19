package Interview_Questions;

public class SumDigits {
    public static void main(String[] args) {
sumOfDigits(153);
    }
    //Sum of the digits
//1236=6+3+2+1=12
    public static void sumOfDigits(int num) {
        int digits;
        int sum = 0;
        while (num > 0) {
            digits = num % 10;
            sum=sum+digits ;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
