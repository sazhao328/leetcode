package ac;

import java.util.*;

//AC
public class _3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > 0)
                    k--;
                else if (nums[i] + nums[j] + nums[k] < 0)
                    j++;
                else {
                    if (!set.contains(nums[j])) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        set.add(nums[j]);
                    }
                    j++;
                    k--;
                }
            }
            set.clear();
        }
        return list;
    }
}
