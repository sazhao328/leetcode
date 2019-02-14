import org.junit.Test;

public class QuickSort {

    public void quickSort(int l, int r, int[] nums) {
        if (l >= r)
            return;
        int compare = nums[l];
        int i = l, j = r;
        while (i < j) {
            while (nums[j] >= compare && i < j)
                j--;
            if (i < j)
                nums[i++] = nums[j];
            while (nums[i] <= compare && i < j)
                i++;
            if (i < j)
                nums[j--] = nums[i];
        }
        nums[i] = compare;
        quickSort(l, i, nums);
        quickSort(i + 1, j, nums);
    }
}
