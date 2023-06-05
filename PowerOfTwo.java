package Java100;

public class PowerOfTwo {
    public boolean powerOfTwo(int number) {
        if (number == 0)
            return false;
        while (number != 1) {
            if (number % 2 != 0)
                return false;
            number = number / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        PowerOfTwo p1 = new PowerOfTwo();
        System.out.println(p1.powerOfTwo(64));
    }
}

