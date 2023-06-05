package Java100;

public class SingleNumber {
    public int singleNumber(int[] numbers) {
        int result = 0;
        for (int i=0; i<numbers.length; i++) {
            result ^= numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers= {4,1,2,1,2};
        SingleNumber s1 = new SingleNumber();
        System.out.println(s1.singleNumber(numbers));
    }
}
