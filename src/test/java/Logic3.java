import java.util.Scanner;

public class Logic3 {
    public static String Again="y";

    static void myLogic3() {
            System.out.println("Invalid input, please use only Y/N");
            Scanner converter = new Scanner(System.in);
            Again = converter.next();

        }
    }


