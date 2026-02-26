import java.util.ArrayList;
import java.util.List;

public class EncodingandDecodingStrings {
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            j++;
            String word = str.substring(j, j + length);
            result.add(word);
            i = j + length;
        }
        return result;
    }
    public static void main(String[] args) {
        String p = "abcd";
        String q = "efg";
        String r = "hijk";
        List<String> l = new ArrayList<>();
        l.add(p);
        l.add(q);
        l.add(r);
        String encoded = encode(l);
        List<String> decoded = decode(encoded);
        System.out.println("input list -> " + l);
        System.out.println("encoded string -> " + encoded);
        System.out.println("decoded list -> " + decoded);
    }
}