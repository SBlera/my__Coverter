import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class myMain {
    private static double ConversionType;
    private static double UserInput;
    private static String UserChoice;

    public static void main(String[] args) throws IOException {
        String reRun = "y";
        Map<String, String> list = new HashMap<String, String>();
        DecimalFormat DF = new DecimalFormat("0.00");

        while (reRun == "y") {
            ConversionType = myConversionType.ConversionType();
            UserInput = myUserInput.getUserInput();
            double result01;
            if (ConversionType == 1) {
                Coin ilsValue = CoinFactory.getCoinInstance(Coins.USD);
                result01 = ilsValue.calculate(UserInput);
                String round01 = DF.format(result01);
                System.out.println("your amount in ILS:\n" + round01);
                list.put(round01, "USD to ILS");

            } else if (ConversionType == 2) {
                Coin usdValue = CoinFactory.getCoinInstance(Coins.ILS);
                double result02 = usdValue.calculate(UserInput);
                String round02 = DF.format(result02);
                System.out.println("your amount in USD:\n" + round02);
                list.put(round02, "ILS to USD");
            } else if (ConversionType == 3) {
                Coin eurValue = CoinFactory.getCoinInstance(Coins.ILS);
                double result03 = eurValue.calculate(UserInput);
                String round03 = DF.format(result03);
                System.out.println("your amount in EUR:\n" + round03);
                list.put(round03, "ILS to EUR");
            }

            while(true){
                UserChoice = myUserChoice.getUserChoice();
                if (UserChoice.equalsIgnoreCase("y")) {
                    reRun = "y";
                    break;
                } else if (UserChoice.equalsIgnoreCase("n")) {
                    System.out.println("Thank you for using our Currency Converter, hope to see you again!\n"
                            + "Here are your conversions so far\n" + list);
                    FileWriter myWriter = new FileWriter("myConversions.txt", true);
                    myWriter.write(String.valueOf(list));
                    myWriter.close();
                    reRun = "n";
                    break;

                }  else System.out.println("Invalid input");
                  }
            }

        }
    }















