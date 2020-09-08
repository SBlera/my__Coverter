import java.util.InputMismatchException;
import java.util.Scanner;


//Get user's input for amount to convert

public class myConversionAmount {
    public static double getConversionAmount() {
        System.out.println("Please enter an amount to convert:");
        double ConversionAmount;
        while (true) {
            try {
                Scanner converter = new Scanner(System.in);
                ConversionAmount = converter.nextDouble();
                {  return ConversionAmount;
                }
            } catch (InputMismatchException e) {
            }
            System.out.println("Invalid input, Please use digits only");

        }
    }
}
