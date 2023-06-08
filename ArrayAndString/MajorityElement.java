package Java100.ArrayAndString;

public class MajorityElement {
    public static int majorityElement(int [] nums){
        int count=0;
        int max_element=0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0){
                max_element=nums[i];
            }
            if(nums[i]==max_element){
                count++;
            }
            else {
                count--;
            }
        }
        return  max_element;
    }

    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
