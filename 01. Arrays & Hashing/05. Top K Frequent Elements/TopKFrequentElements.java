import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class TopKFrequentElements {
    public static int[] topKFrequentElements(int[] nums, int k) {
        HashMap<Integer, Integer> mapp = new HashMap<>(); // mapping -> (element, count)
        for (int i : nums) {
            mapp.put(i, mapp.getOrDefault(i, 0)+1);
        }
        TreeMap<Integer,List<Integer>> reverseMapp = new TreeMap<>(Collections.reverseOrder()); // mapping -> (count, [elements])
        List<Integer> keys = new ArrayList<>(mapp.keySet());
        for (int i : keys) {
            int freq = mapp.get(i);
            List<Integer> list = reverseMapp.getOrDefault(freq, new ArrayList<>());
            list.add(i);
            reverseMapp.put(freq, list);
        }
        List<Integer> counts = new ArrayList<>(reverseMapp.keySet());
        int[] ans = new int[k];
        int currentIndex = 0;
        for (int count : counts) {
            if (currentIndex == k) {
                break;
            }
            List<Integer> elements = reverseMapp.get(count);
            for (int element : elements) {
                ans[currentIndex] = element;
                currentIndex++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,3,3};
        int k = 2;
        int[] ans = topKFrequentElements(nums, k);
        System.out.println(Arrays.toString(ans));
    }
}