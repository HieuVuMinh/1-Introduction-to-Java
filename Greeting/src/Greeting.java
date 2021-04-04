import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greeting;
        System.out.println("Enter Ur Name, Please:");
        greeting = sc.nextLine();
        System.out.println("Hello " + greeting);
    }
}
