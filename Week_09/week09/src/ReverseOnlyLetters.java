public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        char[] sChars = S.toCharArray();
        int start = 0, end = sChars.length - 1;
        while (start < end) {
            if (!isLetter(sChars[start])) {
                start++;
                continue;
            }
            if (!isLetter(sChars[end])) {
                end--;
                continue;
            }

            char tmp = sChars[start];
            sChars[start++] = sChars[end];
            sChars[end--] = tmp;
        }
        return new String(sChars);
    }

    public boolean isLetter(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        } else if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("Qedo1ct-eeLg=ntse-T!"));
    }
}
