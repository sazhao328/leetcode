import org.junit.*;

/**
 * Created by Administrator on 2017/10/20.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        return 0;


    }

    public void quickSort(int[] nums, int p, int r) {

        int q = position(nums, p, r);

    }

    public int position(int[] nums, int p, int r) {

        return 0;
    }

    @org.junit.Test
    public void test() {
        int a = 5, b = 11;
        a = a ^ b;
        System.out.println(a + "   " + b);
        b = a ^ b;
        System.out.println(a + "   " + b);
        a = a ^ b;
        System.out.println(a + "   " + b);
        System.out.println("学123".length());
        System.out.println("123\0".length());
        System.out.println("学123".getBytes().length);
        String s3 = "123";
        String s4 = new String("123");
        String s5 = new String("123");
        String s6 = "123";
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s3 == s6);
    }
}
