package Web.DTO;

public class IncrSeqResponse {
    private long[][] longest_increasing_subsequences;

    public long[][] getLongest_increasing_subsequences() {
        return longest_increasing_subsequences;
    }
    public void setLongest_increasing_subsequences(long[][] longest_increasing_subsequences) {
        this.longest_increasing_subsequences = longest_increasing_subsequences;
    }
}
