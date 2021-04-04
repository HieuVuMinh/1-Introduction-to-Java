import java.util.Scanner;

public class currencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            double vnd = 23000;
            double usd;
            System.out.println("Enter USD:");
            usd = sc.nextDouble();

            double rate = usd * vnd;
            System.out.printf("%1f = %f VNĐ\n", usd, rate);
        } while (true);
    }
}
