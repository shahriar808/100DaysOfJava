package Java100;

public class IsPalindrome {
    public boolean isPalindrome(int x) {

        String intAsString = Integer.toString(x);
        char[] ch = intAsString.toCharArray();
        if (intAsString.length() == 1)
            return true;
        int leftIndex = 0;
        int rightIndex = intAsString.length() - 1;

        while (leftIndex < rightIndex) {
            if (ch[leftIndex] != ch[rightIndex]) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome p1 = new IsPalindrome();
        System.out.println(p1.isPalindrome(12321));
    }
}
