import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Enter ur weight:");
        weight = sc.nextDouble();
        System.out.println("Enter ur height:");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height,2);

        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if ((bmi >= 18.5) && (bmi <25.0)){
            System.out.println("Normal");
        } else if ((bmi >= 25.0) && (bmi < 30.0)){
            System.out.println("Overweight");
        } else if (bmi >= 30.0){
            System.out.println("Obese");
        }
    }
}
