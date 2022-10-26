package BusinessLogic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
    private ArrayList<Long> Sequence = new ArrayList<Long>();
    Methods methods = new Methods();

    public Parser(String Path) {
        try (BufferedReader in = new BufferedReader(new FileReader(Path))) {
            String num;
            while ((num = in.readLine()) != null) {
                Sequence.add(Long.parseLong(num,10));
            }
            in.close();
        }
        catch (IOException | NumberFormatException e1) {
            e1.printStackTrace();
        }
    }

    public long GetMax(){
        return methods.GetMaxValue(Sequence);
    }
    public long GetMin(){
        return methods.GetMinValue(Sequence);
    }
    public double GetMedian(){
        return methods.GetMedValue(Sequence);
    }
    public double GetMean(){
        return methods.GetMeanValue(Sequence);
    }
    public long[][] GetIncrSeq() {
        return methods.GetSubseqs(Sequence, true);
    }
    public long[][] GetDescSeq() {
        return methods.GetSubseqs(Sequence, false);
    }
}
