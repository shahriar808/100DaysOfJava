package Java100.ArrayAndString;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();
        if(m<1)
            return true;
        while(i<n){
            if(tt[i]==ss[j]){
                j++;
            }
            i++;
            if(j==m)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = new String("abc");
        String t = new String("ahbgdc");
        System.out.println(isSubsequence(s,t));
    }
}
