package BusinessLogic;

import java.util.ArrayList;
import java.util.Collections;

public class Methods {

    public long GetMaxValue(ArrayList<Long> seq){
        long ans = Long.MIN_VALUE;
        for (long num: seq)
            ans = Math.max(ans, num);
        return ans;
    }

    public long GetMinValue(ArrayList<Long> seq){
        long ans = Long.MAX_VALUE;
        for (long num: seq)
            ans = Math.min(ans, num);
        return ans;
    }

    public double GetMedValue(ArrayList<Long> seq){
        ArrayList<Long> seq_clone = (ArrayList<Long>) seq.clone();
        Collections.sort(seq_clone);
        int len = seq.size();
        return (len%2 == 0) ? (double) (seq_clone.get(len/2 - 1) + seq_clone.get(len/2)) / 2 : seq_clone.get(len/2);
    }

    public double GetMeanValue(ArrayList<Long> seq) {
        long sum = 0;
        for(long num: seq)
            sum += num;
        return (double) sum / seq.size();
    }

    private boolean compare(long a, long b, boolean incdesc) {
        return incdesc ? a < b : a > b;
    }

    public long[][] GetSubseqs(ArrayList<Long> seq, boolean comp) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int l = -1, r = -1, maxlen = 0;

        for(int i = 1; i < seq.size(); i++) {  // finding all indexes where the longest subsequences start
            if(compare(seq.get(i - 1), seq.get(i), comp)) {
                if(l == -1)
                    l = i - 1;
                r = i;
            }
            if((!(compare(seq.get(i - 1), seq.get(i), comp)) || i == seq.size() - 1) && l != -1) {
                if(r - l + 1 > maxlen) {
                    maxlen = r - l + 1;
                    indexes.clear();
                }
                if(r - l + 1 == maxlen)
                    indexes.add(l);
                l = -1; r = -1;
            }
        }

        long[][] ans = new long[indexes.size()][maxlen]; // restoring the solution
        for(int i = 0; i < indexes.size(); i++) {
            int index = indexes.get(i);
            for(int j = 0; j < maxlen; j++)
                ans[i][j] = seq.get(index + j);
        }

        return ans;
    }
}
