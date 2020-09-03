import java.util.InputMismatchException;
import java.util.Scanner;


//first phase of program - get the required conversion type
public class myConversionType {
   public static double ConversionType(){
        System.out.println("Welcome to currency converter!\n" +
                "Please choose an option (1/2/3):\n" + "(1) USD to ILS \n" + "(2) ILS to USD\n" + "(3) ILS to EUR");
       double ConversionType;
        while (true) {
            try {
                Scanner converter = new Scanner(System.in);
                ConversionType = converter.nextDouble();
                if (ConversionType >= 1 && ConversionType <= 3) {
                    return ConversionType;
                }
            } catch (InputMismatchException e) {
            }
            System.out.println("Oh snap! something went wrong...please choose only 1/2/3");

        }

    }
}
