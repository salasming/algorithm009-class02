public class SolutionRemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[q] - nums[p] > 0) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }

}
