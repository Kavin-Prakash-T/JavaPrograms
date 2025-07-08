
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample{
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");//prompt for the user
        
        // Read a line of text from the console
        String name = br.readLine();
        System.out.println("Hello, " + name + "!");//printing the console message
        
        //It only reads strings we have to typecast it to int or float
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter Your Home Town: ");
        String homeTown = br.readLine();
        System.out.println("Your age is: " + age+"\n"+"Your Home Town is: " + homeTown);

        // Close the BufferedReader
        br.close();
    }

}
