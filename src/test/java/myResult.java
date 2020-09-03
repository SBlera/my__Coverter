//import java.util.HashMap;
//import java.util.Map;
//
//public class myResult {
//
//
//    public static double getResult() {
//
//        Map<Double, String> list = new HashMap<Double, String>();
//
//        double result01;
//        if (myConversionType.getConversionType() == 1) {
//            Coin ilsValue = CoinFactory.getCoinInstance(Coins.USD);
//            result01 = ilsValue.calculate(myUserInput.getUserInput());
//            System.out.println("your amount in ILS:\n" + result01);
//            list.put(result01, "USD to ILS");
//            return result01;
//        }
//        if (myConversionType.getConversionType() == 2) {
//            Coin usdValue = CoinFactory.getCoinInstance(Coins.ILS);
//            double result02 = usdValue.calculate(myUserInput.getUserInput());
//            System.out.println("your amount in USD:\n" + result02);
//            list.put(result02, "ILS to USD");
//        } else if (myConversionType.getConversionType() == 3) {
//            Coin eurValue = CoinFactory.getCoinInstance(Coins.ILS);
//            double result03 = eurValue.calculate(myUserInput.getUserInput());
//            System.out.println("your amount in EUR:\n" + result03);
//            list.put(result03, "ILS to EUR");
//
//        }
//
//
//    }}
//
//
//
//
//
