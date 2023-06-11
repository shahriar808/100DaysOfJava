package Java100.ArrayAndString;

public class JumGame {
    public static boolean canJump(int [] nums){
        int max_reachable = 0;
        for(int i = 0; i<nums.length; i++){
            if(max_reachable < i)
                return false;
            max_reachable = Math.max(max_reachable , i + nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums = {1,5,6,2,3,0,7};
        System.out.println(canJump(nums));
    }
}
