package Interview_Questions;

public class Polindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("java"));
//    }
//
//    public static void polindrome(String str) {
//        String reverse = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse += str.charAt(i);
//        }
//            if (str.equals(reverse)) {
//                System.out.println("Polindrome");
//            }
//            else{
//                System.out.println("NOT");
//            }
//        }
//    }
//        StringBuilder sb = new StringBuilder("abcdcba");
//        String str = sb.toString();
//        String rev = sb.reverse().toString();
//        if(str.equals(rev)){
//            System.out.println("polindrone");
//        }else{
//            System.out.println("not");
//        }
//    }
//}
// Palindrome (When we reverse the word, it is going to be same how it look like from the front)

    }
    public static boolean palindrome(String word){
            if (word == "")
                return false;
            StringBuilder sb = new StringBuilder(word);
            return sb.reverse().toString().equals(word);
        }
        public static void isPalindrome2ndM (String str){
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }
            if (str.equals(reverse))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }


