package Java100;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int[] a;
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2, 7, 5};
        FindDuplicateNumber f1 = new FindDuplicateNumber();
        System.out.println(f1.findDuplicate(nums));
    }
}
