import java.util.Scanner;

public class bai_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ba cạnh tam giác");
        do {
            System.out.println("a = ");
            int a = sc.nextInt();
            System.out.println("b = ");
            int b = sc.nextInt();
            System.out.println("c = ");
            int c = sc.nextInt();

            if ((a + b > c) || (a + c > b) || (b + c > a)) {
                System.out.println("Đây là tam giác");
            }
            if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Đây là tam giác cân");
            } else if ((a == b) && (b == c) && (c == a)) {
                System.out.println("Đây là tam giác đều");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println("Đây là tam giác vuông");
            } else {
                System.out.println("Đây không phải tam giác");
            }
        }while(true);
    }
}
