import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        ArrayList<Double> list = new ArrayList<>();
        Map<Double, String> list = new HashMap<Double, String>();
        String Again = "y";
        while (Again.equalsIgnoreCase("y")) {
            Scanner converter = new Scanner(System.in);
            System.out.println("Welcome to currency converter!\n" +
                    "Please choose an option (1/2/3):\n" +
                    "(1) USD to ILS \n" +
                    "(2) ILS to USD\n" + "(3) ILS to EUR");
            double ConversionType = 0;
            try {
                ConversionType = converter.nextDouble();
            } catch (InputMismatchException e) {
                Logic.myLogic();
            }


            while (ConversionType < 1 || ConversionType > 3) {
                System.out.println("Invalid input, use only 1/2/3");
                Logic.myLogic();
            }


            System.out.println("Please enter an amount to convert:");
            double input = 0;
            try {
                input = converter.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("***Invalid amount*** \n" + "Please use digits only");
            }

            if (ConversionType == 1) {
                Coin ilsValue = CoinFactory.getCoinInstance(Coins.USD);
                double value = ilsValue.calculate(input);
                System.out.println("your amount in ILS:\n" + value);
                list.put(value, "USD to ILS");

            } else if (ConversionType == 2) {
                Coin usdValue = CoinFactory.getCoinInstance(Coins.ILS);
                double value1 = usdValue.calculate(input);
                System.out.println("your amount in USD:\n" + value1);
                list.put(value1, "ILS to USD");

            } else if (ConversionType == 3) {
                Coin eurValue = CoinFactory.getCoinInstance(Coins.ILS);
                double value1 = eurValue.calculate(input);
                System.out.println("your amount in EUR:\n" + value1);
                list.put(value1, "ILS to EUR");
            }


            System.out.println("Need another conversion? choose Y/N");
            Again = converter.next();
            if (Again.equalsIgnoreCase("n")) {
                System.out.println("Thank you for using our Currency Convector, hope to see you again!\n"
                        + "Here are your conversions so far\n" + list);
                FileWriter myWriter = new FileWriter("myConversions.txt", true);
                myWriter.write(String.valueOf(list));
                myWriter.close();

            }
        }

    }
}
































