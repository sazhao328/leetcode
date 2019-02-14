import org.junit.*;

/**
 * Created by Administrator on 2017/10/17.
 */
public class LongestPalindrome {
    @org.junit.Test
    public void test() {
        System.out.println(getLength("babad", 1, 2));
        System.out.println(longestPalindrome("aba"));
    }

    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int len1 = getLength(s, i, i);
            int len2 = getLength(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                end = i + len / 2;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int getLength(String s, int l, int r) {
        int len = 0;
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                len = r - l + 1;
                l--;
                r++;
            } else
                return len;
        }
        return len;
    }
}

