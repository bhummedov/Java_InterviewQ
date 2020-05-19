package Interview_Questions;

import java.lang.reflect.Array;

public class ReverseArray {
//    public static void main(String[] args) {
//     reverseArray("Afghanistan");
//    }
//    public static void reverseArray(String words){
//        String removed="";
//        for (int i=words.length()-1; i>=0; i--){
//           removed+=words.charAt(i);
//
//        }
//        System.out.println(removed);
//    }
//}
    // charArray reverse
    public static void main(String[] args) {
        reverseArray("java");
    }
    public static void reverseArray(String words) {
        char[] txt = words.toCharArray();
        for (int i = words.length() - 1; i >= 0; i--) {
            System.out.println(txt[i]);
        }
    }
}


