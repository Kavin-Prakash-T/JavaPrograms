public class ConsoleOutput {
    public static void main(String[] args) {
        System.out.print("Hello, ");//no new line at end
        System.out.print("World!");
        System.out.println(); //print a new line
        System.out.println("Hello,");
        System.out.println("World!");
        System.out.write(72); //no new line ,prints the ASCII value
        System.out.write(105); 
        System.out.write('\n'); 
        System.out.flush(); //flushes
    }

}
