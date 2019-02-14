package ac;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectSum = 0;
        int exactSum = 0;
        for (int i = 0; i < n; i++) {
            exactSum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            expectSum += nums[i];
        }
        return Math.abs(expectSum - exactSum);
    }
}
