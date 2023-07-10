package Java100.ArrayAndString;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int temp = 1;
        for(int i = 0; i< nums.length; i++) {
            product[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            product[i] *= temp;
            temp *= nums[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
