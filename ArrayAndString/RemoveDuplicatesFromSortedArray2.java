package Java100.ArrayAndString;

public class RemoveDuplicatesFromSortedArray2 {
    public static int removeDuplicates2(int [] nums){
        int   index = 1;
        int  count = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 0;
            }
            if(count <= 1){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates2(nums));

    }
}
