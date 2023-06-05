package Java100.ArrayAndString;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for (int i = 0; i <nums.length; i++) {
            if(val!=nums[i]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }

    public static void main(String[] args) {
        int []nums={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}
