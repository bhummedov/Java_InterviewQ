package Interview_Questions;
// 1). Define a string.
// 2). Convert the string to lower case so that comparisons can be reduced.....
// 3). If any character in string matches with vowels (a, e, i, o, u ) then increment the vcount by 1.
// 4). If any character lies between 'a' and 'z' except vowels, then increment the count for ccount by 1.
// 5). Print both the counts.

public class CountVowelsAndConstans{
    public static void main(String[] args) {
        vowelCount();
    }

    public static void vowelCount() {
        String vowels = "Java is fun";
        int count = 0;
        vowels = vowels.toLowerCase();
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'i' || vowels.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

}
