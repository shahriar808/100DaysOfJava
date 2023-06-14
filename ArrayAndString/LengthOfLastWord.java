package Java100.ArrayAndString;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int op = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            op++;
        }
        return op;
    }

    public static void main(String[] args) {
        String s = new String("  fly me   to   the moon  ");
        System.out.println(lengthOfLastWord(s));

    }
}
