import java.io.Console;
public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();//creating object 
        if (console != null) {
            String user = console.readLine("Enter username: ");
            //char[] password = console.readPassword("Enter password: ");//no words typed will apper on the console 
            System.out.println("Welcome, " + user);
        } else {
            System.out.println("Console not available.");
        }
    }

}
