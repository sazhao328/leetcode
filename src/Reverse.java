import org.junit.*;

/**
 * Created by Administrator on 2017/10/20.
 */
public class Reverse {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }
        char[] chars = String.valueOf(x).toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        int res = 0;
        try {
            if (isNegative) {
                res = -Integer.valueOf(String.valueOf(chars));
            } else
                res = Integer.valueOf(String.valueOf(chars));
        } catch (Exception e) {
            return 0;
        }
        return res;
    }

    @org.junit.Test
    public void test() {
        System.out.println(reverse(1111111119));
    }
}
