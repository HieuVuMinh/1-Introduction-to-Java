import java.sql.SQLOutput;
import java.util.*;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("a = ");
        a = sc.nextDouble();
        System.out.println("b = ");
        b = sc.nextDouble();
        System.out.println("c = ");
        c = sc.nextDouble();
        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("Nghiệm : %f!\n", answer);
        } else {
            if (b == 0){
                System.out.println("Vô số nghiệm");
            } else {
                System.out.println("Vô nghiệm");
            }
        }
    }
}
