package Java100;

public class SortArray_0_1_2 {
    public int[] sortArray_0_1_2(int nums[]) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, mid, left);
                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, right);
                mid++;
                right--;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
