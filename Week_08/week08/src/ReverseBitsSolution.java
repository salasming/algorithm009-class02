public class ReverseBitsSolution {
    public int reverseBits(int n) {
        int result = 0;
        for (int bitsize = 31; n != 0; n = n >>> 1, bitsize--) {
            result += (n & 1) << bitsize;
        }
        return result;
    }
}
