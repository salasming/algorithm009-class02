public class ReverseWordsSolutionThree {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String[] strArr = s.trim().split(" ");
        for (int i = 0; i < strArr.length; i++) {
            char[] tmpCharArr = strArr[i].toCharArray();
            int start = 0, end = tmpCharArr.length - 1;
            char tmp;
            while (start < end) {
                tmp = tmpCharArr[start];
                tmpCharArr[start++] = tmpCharArr[end];
                tmpCharArr[end--] = tmp;
            }
            sb.append(new String(tmpCharArr));
            if (i != strArr.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsSolutionThree().reverseWords("  hello world!  "));
        System.out.println(new ReverseWordsSolutionThree().reverseWords("the sky is blue"));
    }
}
