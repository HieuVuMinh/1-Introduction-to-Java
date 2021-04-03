import java.util.*;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the number: ");
            int a = sc.nextInt();

            if (a >= 0) {
                System.out.println("Đây là số nguyên dương");
            } else {
                System.out.println("Đây là số nguyên âm");
            }
        } while (true);
    }
}
