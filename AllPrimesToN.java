package Java100;

import java.util.ArrayList;
import java.util.List;

public class AllPrimesToN {
    public List<Integer> enumeratePrimes(int n) {
        if (n <= 1) {
            return new ArrayList<>();
        }
        List<Integer> output = new ArrayList<>();
        int i = 2;
        while (i < n) {
            int j = 2;
            boolean isPrime = true;
            while (j < i) {
                if (i % j == 0) {
                    isPrime = false;
                }
                j++;
            }
            if (isPrime) {
                output.add(i);
            }
            i++;
        }
        return output;
    }
}
