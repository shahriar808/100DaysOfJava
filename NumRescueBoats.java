package Java100;

import java.util.Arrays;

public class NumRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        for (int i = 0, j = people.length - 1; i <= j; ++ans) {
            int remain = limit - people[j--];
            if (people[i] <= remain)
                ++i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] people = {1, 3, 3, 2, 2, 1};
        NumRescueBoats n1 = new NumRescueBoats();
        System.out.println(n1.numRescueBoats(people, 4));
    }
}
