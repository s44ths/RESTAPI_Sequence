package Web;

import Web.DTO.*;
import BusinessLogic.Parser;
import io.swagger.annotations.ApiOperation;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SequenceController {

    @RequestMapping(value = "/maxvalue", method = RequestMethod.POST, produces = {"application/json", "application/xml"})
    @ApiOperation("Finding the maximum value in a sequence")
    public MaxValResponse MaxRequest(@RequestBody @NotNull FileInfo FilePath) {
        Parser parser = new Parser(FilePath.getFile_path());
        MaxValResponse res = new MaxValResponse();
        res.setMax_value(parser.GetMax());
        return res;
    }

    @RequestMapping(value = "/minvalue",method = RequestMethod.POST, produces = {"application/json", "application/xml"})
    @ApiOperation("Finding the minimum value in a sequence")
    public MinValResponse MinRequest(@RequestBody @NotNull FileInfo FilePath) {
        Parser parser = new Parser(FilePath.getFile_path());
        MinValResponse res = new MinValResponse();
        res.setMin_value(parser.GetMin());
        return res;
    }

    @RequestMapping(value = "/medvalue",method = RequestMethod.POST, produces = {"application/json", "application/xml"})
    @ApiOperation("Finding the median")
    public MedianResponse MedRequest(@RequestBody @NotNull FileInfo FilePath) {
        Parser parser = new Parser(FilePath.getFile_path());
        MedianResponse res = new MedianResponse();
        res.setMedian(parser.GetMedian());
        return res;
    }

    @RequestMapping(value = "/meanvalue",method = RequestMethod.POST, produces = {"application/json", "application/xml"})
    @ApiOperation("Finding the mean value")
    public MeanResponse MeanRequest(@RequestBody @NotNull FileInfo FilePath) {
        Parser parser = new Parser(FilePath.getFile_path());
        MeanResponse res = new MeanResponse();
        res.setMean(parser.GetMean());
        return res;
    }

    @RequestMapping(value = "/incr_sequence",method = RequestMethod.POST, produces = {"application/json", "application/xml"})
    @ApiOperation("Finding the longest increasing subsequences")
    public IncrSeqResponse IncrRequest(@RequestBody @NotNull FileInfo FilePath) {
        Parser parser = new Parser(FilePath.getFile_path());
        IncrSeqResponse res = new IncrSeqResponse();
        res.setLongest_increasing_subsequences(parser.GetIncrSeq());
        return res;
    }

    @RequestMapping(value = "/decr_sequence",method = RequestMethod.POST, produces = {"application/json", "application/xml"})
    @ApiOperation("Finding the longest decreasing subsequences")
    public DescSeqResponse DescRequest(@RequestBody @NotNull FileInfo FilePath) {
        Parser parser = new Parser(FilePath.getFile_path());
        DescSeqResponse res = new DescSeqResponse();
        res.setLongest_decreasing_subsequences(parser.GetDescSeq());
        return res;
    }
}
