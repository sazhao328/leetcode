import org.junit.Test;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0)
            return "";
        String commonPrefix = "";
        String prefix;
        strs[0] += "_";
        for (int i = 0; i < strs[0].length(); i++) {
            prefix = strs[0].substring(0, i);

            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    return commonPrefix;
                }
            }
            commonPrefix = prefix;
        }
        return commonPrefix;
    }
}
