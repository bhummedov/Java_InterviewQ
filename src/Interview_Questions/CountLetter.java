package Interview_Questions;
// STEP 1: START.
// STEP 2: DEFINE String string = "The best of both worlds".
// STEP 3: SET count =0.
// STEP 4: SET for loop (i=0; i<string.length(); i++).
// STEP 5: IF (string. charAt(i)!= ' ')
// STEP 6: then count++.
// STEP 7: PRINT count.
// STEP 8: END.

public class CountLetter {
    public static void main(String[] args) {
        countLetter();
    }

    public static void countLetter() {
        String words = "Java is fun";
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}


