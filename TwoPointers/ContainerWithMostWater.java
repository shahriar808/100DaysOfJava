package Java100.TwoPointers;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int minHight = Math.min(height[left], height[right]);
            max = Math.max(max, (right - left) * minHight);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int [] hight = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(hight));
    }
}
