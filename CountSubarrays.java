package Java100;

import java.util.HashMap;

public class CountSubarrays {
    private int countSubarrays(int[] array, int k) {
        HashMap<Integer, Integer> array_sum = new HashMap<>();
        array_sum.put(0, 1);
        int sum = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array_sum.containsKey(sum - k)) {
                result += array_sum.get(sum - k);
            }
            array_sum.put(sum, array_sum.getOrDefault(sum, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, -4, -2, 1, 5};
        CountSubarrays c1 = new CountSubarrays();
        System.out.println(c1.countSubarrays(array, 3));
    }
}


    /*private int countSubarrays(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }*/
