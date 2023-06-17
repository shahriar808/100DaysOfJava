package Java100.ArrayAndString;

public class H_Index {
    public static int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;

        int n = citations.length;
        int[] Bucket = new int[n+1];

        for(int i=0; i<n; i++) {
            if(citations[i]>n)
                Bucket[n]++;
            else
                Bucket[citations[i]]++;
        }

        if(Bucket[n]>=n)
            return n;
        for(int i=n-1; i>=0; i--) {
            Bucket[i] += Bucket[i+1];
            if(Bucket[i]>=i)
                return i;
        }
        return 0;

    }
    public static void main(String[] args) {
        int [] citation = {3,0,6,1,5};
        System.out.println(hIndex(citation));
    }
}
