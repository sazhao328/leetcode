import org.junit.Test;

/**
 * Created by Administrator on 2017/9/18.
 */
public class FindMedianSortedArrays {
    @Test
    public void test() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        System.out.println("nums1.length" + nums1.length);
        System.out.println("num2.length" + nums2.length);
        int[] longer;
        int[] shorter;
        if (nums1.length > nums2.length) {
            longer = nums1;
            shorter = nums2;
        } else {
            longer = nums2;
            shorter = nums1;
        }
        return findMedianSortedArrays(longer, 0, longer.length - 1, shorter, 0, shorter.length - 1);
    }

    public double findMedianSortedArrays(int[] longer, int longerStart, int longerEnd, int[] shorter, int shorterStart, int shorterEnd) {
        if (shorterEnd - shorterStart < 0) {
            return getMedian(longer, longerStart, longerEnd);
        }
        System.out.println("longStart" + longerStart);
        System.out.println("longEnd" + longerEnd);
        double longerMedian = getMedian(longer, longerStart, longerEnd);
        System.out.println("longMedian:" + longerMedian);
        double shorterMedian = getMedian(shorter, shorterStart, shorterEnd);
        System.out.println("shorterMedain" + shorterMedian);
        System.out.println("longEnd-longerStart==" + (longerEnd - longerStart));
        if (longerMedian == shorterMedian)
            return longerMedian;
        if (shorterEnd == shorterStart) {
            if (longerEnd == longerStart)
                return (longerMedian + shorterMedian) / 2.0;
            else
                return longerMedian > shorterMedian ? getMedian(longer, longerStart, longerEnd - 1) : getMedian(longer, longerStart + 1, longerEnd);
        }
        int tail = (shorterEnd - shorterStart + 1) / 2;
        if (longerMedian > shorterMedian)
            return findMedianSortedArrays(longer, longerStart, longerEnd - tail, shorter, shorterStart + tail, shorterEnd);
        else
            return findMedianSortedArrays(longer, longerStart + tail, longerEnd, shorter, shorterStart, shorterEnd - tail);
    }

    public double getMedian(int[] nums, int start, int end) {
        for (int num : nums) {
            System.out.println(num);
        }
        if (end == start)
            return nums[start];
        double median;
        if ((end - start) % 2 == 0) {
            median = nums[(start + end) / 2];
        } else {
            median = (nums[(start + end) / 2] + nums[(start + end) / 2 + 1]) / 2.0;
        }
        return median;
    }

}