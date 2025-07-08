public class TypeCasting {

    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = intValue; 
        System.out.println("Implicit Casting: " + doubleValue);
        
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; 
        System.out.println("Explicit Casting: " + anotherIntValue);

        Object obj = "Hello, World!";
        String str = (String) obj; 
        System.out.println("Object Type Casting: " + str);
    }

}
