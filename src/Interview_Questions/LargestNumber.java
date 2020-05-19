package Interview_Questions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class LargestNumber {
    //Swap two numbers without using a temporary variable
    // a=4 b=11
    //a=11 b=4
//    public static void SwapTwoNumber(int a, int b) {
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a + " " + b);
//    }
//    //Largest Number in Array
//    // [4,7,76,31,43, 0]
//    public static void largestNumM1(int[] a) {
//        Arrays.sort(a);
//        System.out.println(a[a.length - 1]);
//    }
//    public static int largestNumM2(Integer[] a) {
//        List<Integer> list1 = Arrays.asList(a);
//        Collections.sort(list1);
//        int largest = list1.get(a.length - 1);
//        return largest;
//    }
//    public static int largestNumM3(int[] a) {
//        int tempMax = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i + 1] > a[i]) {
//                tempMax = a[i + 1];
//            }
//        }
//        return tempMax;
//    }
    public static void main(String[] args) {
        int[] arr = {9,2,3,6,5};
        largestNumM4(arr);
    }
    public static void largestNumM4(int[] a) {
        int tempMax = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) { // compare 1sd and 2nd elements if the first element is greater than the 2nd
                    tempMax = a[i]; //declare a bigger number in array to the tempMax,
                    a[i] = a[j];   // it is overwritten with the new value.
                    a[j] = tempMax; // We declare and swap array biggest number we found on the top
                }
            }
        }

        System.out.println(a[a.length-1]);
    }
}
