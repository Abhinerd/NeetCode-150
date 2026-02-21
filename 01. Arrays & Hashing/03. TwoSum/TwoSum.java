import java.util.HashMap;

public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            if (mapp.containsKey(target - nums[i])) {
                ans[0] = mapp.get(target-nums[i]);
                ans[1] = i;
                break;
            }
            else {
                mapp.put(nums[i], i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}