package Java100;

public class ReverseBits {
    public int reverseBits(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber << 1;
            if ((number & 1) == 1) {
                reverseNumber = reverseNumber | 1;
            }
            number = number >> 1;
        }
        return reverseNumber;
    }

}


