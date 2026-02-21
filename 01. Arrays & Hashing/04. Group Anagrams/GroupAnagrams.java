import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mapp = new HashMap<>();
        for (String s : strs) {
            int[] letters = new int[26];
            int l = s.length();
            for(int i = 0; i<l; i++) {
                Character c = s.charAt(i);
                letters[ ((int) c) - ((int) 'a') ] += 1;
            }
            String key = Arrays.toString(letters);
            if (!mapp.containsKey(key)) {
                mapp.put(key, new ArrayList<>());
            }
            mapp.get(key).add(s);
        }
        return new ArrayList<>(mapp.values());
    }
    public static void main(String[] args) {
        String[] strs = new String[] {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
    }
}
