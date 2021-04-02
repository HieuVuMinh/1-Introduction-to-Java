import java.util.*;

public class rectangel {
    public static void main(String[] args) {
        // Khai báo biến độ dài rộng
        float width;
        float height;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = sc.nextFloat();

        System.out.println("Enter height: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("Area = " + area);
    }
}
