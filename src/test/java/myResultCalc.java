import java.text.DecimalFormat;

//Translate conversion type into the required conversion value

public class myResultCalc {
    static Coin getConversionObject(double ConversionType) {
        Coin conversion = null;
        if (ConversionType==1) {
            conversion = CoinFactory.getCoinInstance(Coins.USD);
        } else if (ConversionType==2) {
            conversion = CoinFactory.getCoinInstance(Coins.ILS);
        } else if (ConversionType==3) {
            conversion = CoinFactory.getCoinInstance(Coins.EUR);
        }
        return conversion;
    }

    //Use conversion object to and format final result to print on screen

    static String getResultCalc(Coin conversion, double ConversionAmount){
        DecimalFormat DF = new DecimalFormat("0.00");
        double calcConversionResult = conversion.calculate(ConversionAmount);
        String roundResultString = DF.format(calcConversionResult);
        System.out.println("your amount in " +  conversion.GetName() + ":\n" + roundResultString);
        return roundResultString;
    }
}
