import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner v1=new Scanner(System.in);
        System.out.print("Enter your Name:");
        String v2=v1.nextLine();
        System.out.print("Hello "+v2+"!");
        v1.close();
    }
}
