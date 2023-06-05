package Java100.ArrayAndString;

public class AddStrings {
    public String addStrings(String s1, String s2) {
        int s1Len = s1.length() - 1;
        int s2Len = s2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (s1Len > -1 || s2Len > -1 || carry == 1) {
            if (s1Len > -1) {
                carry += s1.charAt(s1Len--) - '0';
            }
            if (s2Len > -1) {
                carry += s2.charAt(s2Len--) - '0';
            }
            sb.insert(0, carry % 10);
            carry /= 10;

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AddStrings a1 = new AddStrings();
        System.out.println(a1.addStrings("95", "7"));
    }
}
