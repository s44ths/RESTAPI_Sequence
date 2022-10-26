package Web.DTO;

public class DescSeqResponse {
    private long[][] longest_decreasing_subsequences;

    public long[][] getLongest_decreasing_subsequences() {
        return longest_decreasing_subsequences;
    }
    public void setLongest_decreasing_subsequences(long[][] longest_decreasing_subsequence) {
        this.longest_decreasing_subsequences = longest_decreasing_subsequence;
    }
}
