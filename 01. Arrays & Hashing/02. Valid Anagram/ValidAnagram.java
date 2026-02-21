import java.util.HashMap;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t) {
        HashMap<Character,Integer> mapp1 = new HashMap<>();
        int l1 = s.length();
        int l2 = t.length();
        if (l1 != l2) {
            return false;
        }
        for (int i = 0; i<l1; i++) {
            mapp1.put(s.charAt(i), 1+mapp1.getOrDefault(s.charAt(i), 0));
        }
        for (int i = 0; i<l2; i++) {
            Integer f = mapp1.get(t.charAt(i));
            if (f == null || f == 0) {
                return false;
            }
            mapp1.put(t.charAt(i), -1+f);
        }
        return true;
    }
    public static void main(String[] args) {
        boolean b = validAnagram("racecar", "carrace");
        System.err.println("b = "+b);
    }
}
