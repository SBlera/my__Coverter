import java.util.InputMismatchException;
import java.util.Scanner;

public class myUserInput {
    public static double getUserInput() {
        System.out.println("Please enter an amount to convert:");
        double UserInput;
        while (true) {
            try {
                Scanner converter = new Scanner(System.in);
                UserInput = converter.nextDouble();
                {  return UserInput;
                }
            } catch (InputMismatchException e) {
            }
            System.out.println("Invalid input, Please use digits only");

        }
    }
}
