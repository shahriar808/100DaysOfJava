package Java100.ArrayAndString;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost){
        int position = 0;
        int sum = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += (gas[i] - cost[i]);
            if(sum < 0){
                total += sum;
                sum = 0;
                position = i+1;
            }
        }
        total += sum;
        if (total < 0)
            return -1;
        return position;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
