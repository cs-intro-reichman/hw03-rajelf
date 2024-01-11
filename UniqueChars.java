/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string,
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String answer = "";
        String before;
        char currentChar;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            currentChar = s.charAt(i);
            before = s.substring(0, i);
            if (before.indexOf(currentChar) == -1 || currentChar == ' ') {
                answer = answer + currentChar;
            }
        }
        return answer;
    }
}