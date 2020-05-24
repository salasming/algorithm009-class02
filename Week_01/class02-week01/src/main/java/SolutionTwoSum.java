import java.util.HashMap;

public class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int cha = target - nums[i];
            if (m.containsKey(cha)) {
                return new int[]{m.get(cha), i};
            }
            m.put(nums[i], i);
        }
        throw new IllegalArgumentException("no result.");
    }
}
