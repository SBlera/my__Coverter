import java.util.InputMismatchException;
import java.util.Scanner;


//Get user's choice for the required conversion type + check logic

public class myConversionType {
    public static double GetConversionType(){
        System.out.println("Welcome to currency converter!\n" +
                "Please choose an option (1/2/3):\n" + "(1) USD to ILS \n" + "(2) ILS to USD\n" + "(3) ILS to EUR");
       double ConversionType;
        while (true) {
            try {
                Scanner converter = new Scanner(System.in);
                ConversionType = converter.nextInt();
                if (ConversionType >= 1 && ConversionType <= 3) {
                    return ConversionType;
                }
            } catch (InputMismatchException e) {
            }
            System.out.println("Invalid input...please use only 1/2/3");

        }

    }
}
