import java.util.Scanner;

//last phase of program - offer another conversion or finish (logic on main)

public class myUserChoice {
    public static String getUserChoice() {
        System.out.println("Need another conversion? choose Y/N");
        String UserChoice;
        UserChoice = new String();
        while (true) {
           try{
               Scanner converter = new Scanner(System.in);
               UserChoice = converter.next();
               if (UserChoice.equalsIgnoreCase("y") || UserChoice.equalsIgnoreCase("n"))
            return UserChoice;
           } catch(Exception e){
               System.out.println("Invalid input");
           }
return UserChoice;
        }
    }}





