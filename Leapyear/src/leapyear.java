import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int year;
            System.out.println("Enter the year U wanna check?");
            year = sc.nextInt();
            boolean leapYear = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leapYear = true;
                    }
                } else {
                    leapYear = true;
                }
            }
            if (leapYear){
                System.out.printf("%d is a leap year\n", year);
            } else {
                System.out.printf("%d not a leap year\n", year);
            }
        } while (true);
    }
}
