import java.util.Scanner;

//Offer another conversion or finish + check input

public class myUserChoice {
    public static String getUserChoice() {
        System.out.println("Need another conversion? choose Y/N");
        String UserChoice = new String();
        while (true) {
           try{
               Scanner converter = new Scanner(System.in);
               UserChoice = converter.next();
               if (UserChoice.equalsIgnoreCase("y") || UserChoice.equalsIgnoreCase("n"))
                   return UserChoice;
               if(!UserChoice.equalsIgnoreCase("y") || !UserChoice.equalsIgnoreCase("n")){
                   System.out.println("Invalid input,try gain!");
               }
           }catch(Exception e){
               System.out.println("Invalid input,try gain!");
           }
        }
    }
}





