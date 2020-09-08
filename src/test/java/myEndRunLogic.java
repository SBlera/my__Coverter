import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// What happens when user doesn't want another conversion logic

public class myEndRunLogic {

    static void EndRunLogic(ArrayList<ConversionResult> myList) throws IOException {
                System.out.println("Thank you for using our Currency Converter, hope to see you again!\n"
                        + "Here are your conversions so far\n" + myList);
                FileWriter myWriter = new FileWriter("myConversions.txt", true);
                myWriter.write(String.valueOf(myList));
                myWriter.close();
        }
    }

