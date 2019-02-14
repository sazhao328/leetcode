package ac;

import org.junit.Test;

public class FindTheDuplicateNumber {
    @Test
    public void test() {
        int[] nums = {1,3,4,2,2};
        int res = findDuplicate(nums);
        System.out.println(res);
    }

    public int findDuplicate(int[] nums) {
        quickSort(0, nums.length - 1, nums);
        int pre = 0;
        for (int num : nums) {
            if (num == pre)
                return pre;
            pre = num;
        }
        return pre;
    }

    public void quickSort(int l, int r, int[] nums) {
        if (l < r) {
            int i = l, j = r, target = nums[l];
            while (i < j) {
                while (nums[j] >= target && i < j)
                    j--;
                if (i < j)
                    nums[i++] = nums[j];
                while (nums[i] <= target && i < j)
                    i++;
                if (i < j)
                    nums[j--] = nums[i];
            }
            nums[i] = target;
            quickSort(l, i, nums);
            quickSort(i + 1, r, nums);
        }
    }
}
