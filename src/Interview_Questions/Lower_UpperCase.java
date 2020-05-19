package Interview_Questions;

public class Lower_UpperCase {
    public static void main(String[] args) {
        lowerToUpper("javaisfun JAVAISFUN");
    }
    public static void lowerToUpper(String letter){
        for (int i=0; i<letter.length(); i++){
            char index = letter.charAt(i);
            if (index >= 92 && index <=122){
                System.out.print((char)(index-32));
            }
            else{
                System.out.println((char)(index+32));
            }

        }
    }
}
