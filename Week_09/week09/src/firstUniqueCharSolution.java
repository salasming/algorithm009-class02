public class firstUniqueCharSolution {
    public int firstUniqChar(String s) {
        int[] firstString = new int[128];
        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            firstString[c - 'a']++;
        }
        for (int i = 0; i < sChar.length; i++) {
            char cc = sChar[i];
            if (firstString[cc - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
