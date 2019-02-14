import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int max = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = max > j - i ? max : j - i;
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}