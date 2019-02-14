//todo
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        final int n = height.length;
        int maxArea = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

}
