import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int runningPrefixProduct = 1;
        int runningSuffixProduct = 1;
        for (int i = 0; i<nums.length; i++) {
            ans[i] = runningPrefixProduct;
            runningPrefixProduct*=nums[i];
        }
        for (int i = nums.length-1; i>=0; i--) {
            ans[i] = ans[i] * runningSuffixProduct;
            runningSuffixProduct*=nums[i];
        }
        return ans; 
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}