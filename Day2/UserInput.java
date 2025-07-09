import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner v1=new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age=v1.nextInt();//After getting an integer as input there is a error to get a string.So a nextLine() is used to skip a line
        v1.nextLine();
        System.out.print("Enter Your Name:");
        String name=v1.nextLine();
        System.out.print("Enter Your height:");
        float height=v1.nextFloat();
        System.out.print("Are you Studying School:");
        boolean isStydyingSchool=v1.nextBoolean();//True
        System.out.println("Name: "+name+"  Age: "+age+"  Height: "+height+"  Studying in School: "+isStydyingSchool);//true
        v1.close();
    }
}
