public class ReverseWordsSolution {
    public String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        int i = 0, j = strArr.length - 1;
        String tmp = "";
        while (i < j) {
            tmp = strArr[i];
            strArr[i++] = strArr[j];
            strArr[j--] = tmp;
        }
        StringBuffer sb = new StringBuffer();
        for (int m = 0; m < strArr.length; m++) {
            sb.append(strArr[m]);
            if (m != strArr.length-1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsSolution().reverseWords("  hello world!  "));
        System.out.println(new ReverseWordsSolution().reverseWords("the sky is blue"));
    }
}
