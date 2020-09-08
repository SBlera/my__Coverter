import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //create list for later results
        var conversionResults = new ArrayList<ConversionResult>();
        while (true) {
            //run parts that pick user choice for conversion type and amount
            int conversionType = (int) myConversionType.GetConversionType();
            double conversionAmount = myConversionAmount.getConversionAmount();
            //create conversion object according to user's choices and calc result of conversion according to fixed rates
            var conversionObj = myResultCalc.getConversionObject(conversionType);
            var result = new ConversionResult();
            result.resultString = myResultCalc.getResultCalc(conversionObj,conversionAmount);
            result.conversionSting = conversionObj.GetName();
            //save results to list
            conversionResults.add(result);
            //get user's choice for an option to convert again or not (yes for rerun no for exit)
            var shouldEndRun = myUserChoice.getUserChoice();
            if (shouldEndRun.equalsIgnoreCase("n")){
                myEndRunLogic.EndRunLogic(conversionResults);
                return;
            }
        }
    }
}