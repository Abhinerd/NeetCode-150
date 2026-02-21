import java.util.HashSet;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> mapp = new HashSet<>();
        for (int i = 0; i<nums.length; i++) {
            if (!mapp.contains(nums[i])) {
                mapp.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}