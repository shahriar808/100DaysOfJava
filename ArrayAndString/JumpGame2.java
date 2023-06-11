package Java100.ArrayAndString;

public class JumpGame2 {
    public static int canJump2(int [] nums){

            int jumps = 0;
            int current = 0;
            int maxReach = 0;
            for(int i=0;i<nums.length-1;i++){
                maxReach = Math.max(maxReach,i+nums[i]);
                if(i==current){
                    current = maxReach;
                    jumps++;
                }
            }
            return jumps;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,0,1,4};
        System.out.println(canJump2(nums));
    }
}
