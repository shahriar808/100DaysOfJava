package Java100.ArrayAndString;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int [] nums){
        int n=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[n]!=nums[i]){
                n++;
                nums[n]=nums[i];
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }
}
