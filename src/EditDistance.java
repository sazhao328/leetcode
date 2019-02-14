import org.junit.*;

/**
 * Created by Administrator on 2017/10/23.
 */
public class EditDistance {
    @org.junit.Test
    public void test() {
        String a = "bc";
        String b = "aba";
        System.out.println(editDistance(a,b));
    }
    public int editDistance(String a, String b) {
        int[][] edit = new int[a.length()][b.length()];
        for (int i = 0; i < a.length(); i++) {
            edit[i][0] = i;
        }
        for (int j = 0; j < b.length(); j++) {
            edit[0][j] = j;
        }
        for (int i = 1; i < a.length(); i++) {
            for (int j = 1; j < b.length(); j++) {
                int min = Integer.MAX_VALUE;
                min = Math.min(min, edit[i - 1][j] + 1);
                min = Math.min(min, edit[i][j - 1] + 1);
                min = Math.min(min, edit[i - 1][j - 1] + f(a.charAt(i), b.charAt(j)));
                edit[i][j] = min;
            }
        }
        return edit[a.length() - 1][b.length() - 1];

    }

    public int f(char c1, char c2) {
        if (c1 == c2) {
            return 0;
        } else {
            return 1;
        }
    }

}
