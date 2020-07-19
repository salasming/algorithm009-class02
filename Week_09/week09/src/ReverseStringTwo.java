public class ReverseStringTwo {

    public String reverseStr(String s, int k) {
        char[] originChar = s.toCharArray();
        for (int start = 0; start < originChar.length; start = start + 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, originChar.length - 1);
            while (i < j) {
                char tmp = originChar[i];
                originChar[i++] = originChar[j];
                originChar[j--] = tmp;
            }

        }
        return new String(originChar);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStringTwo().reverseStr("abcdefg", 3));
    }

}
