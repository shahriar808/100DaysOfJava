package Java100;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] array) {
        Set<List<Integer>> allThreeSum = new HashSet<>();
        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int sum = array[i] + array[left] + array[right];

                if (sum == 0) {
                    allThreeSum.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(allThreeSum);
    }

    public static void main(String[] args) {
        int[] array = {-5, 3, 2, 0, 1, -1, -5, 3, 2};
        ThreeSum t1 = new ThreeSum();
        System.out.println(t1.threeSum(array));

    }
}
