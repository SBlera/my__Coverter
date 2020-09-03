import org.apache.commons.digester.plugins.PluginInvalidInputException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class myUserChoice {
    public static String getUserChoice() {
        System.out.println("Need another conversion? choose Y/N");
        String UserChoice;
        UserChoice = new String();
        while (true) {
           try{
               Scanner converter = new Scanner(System.in);
            UserChoice = converter.next();
            return UserChoice;
           } catch(Exception e){
               System.out.println("Invalid input");
           }
return UserChoice;
        }
    }}





