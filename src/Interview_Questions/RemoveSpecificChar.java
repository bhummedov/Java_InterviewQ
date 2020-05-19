package Interview_Questions;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        //System.out.println(removeCharStr("java is fun",'i'));
        // removeChar("java is fun", 'i');
         RemoveChar("java is fun", 'i');
       // System.out.println(RemoveChar("java is fun",'i'));

    }

    public static void RemoveChar(String letter, char text) {
        String remove = "";
        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) != text) {
                remove += letter.charAt(i);

            }
        }
      //  return remove;
        System.out.println(remove);
    }
}

//
//    public static void removeChar(String text, char letter) {
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) != letter) {
//                System.out.print(text.charAt(i));
//            }
//        }
//    }
//}
//    public static String removeCharStr(String text,char letter){
//        String removed="";
//        for(int i=0;i<text.length();i++){
//            if(text.charAt(i)!=letter){
//                removed+=text.charAt(i);
//            }
//        }
//        return removed;
//    }
//}

