import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số: ");
            int a = sc.nextInt();

            if ((a % 3 == 0) && (a % 5 == 0)) {
                System.out.println("FIZZBUZZ");
                break;
            }
            if (a % 3 == 0) {
                System.out.println("FIZZ");
            } else if (a % 5 == 0) {
                System.out.println("BUZZ");
            }
        } while (true);
    }
}
