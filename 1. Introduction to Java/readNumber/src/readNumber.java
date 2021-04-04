import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the Number U wanna read?");
            int i, number = sc.nextInt();
            int a = number / 10;
            int b = number % 10;

            String[] numberArray1 = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            String[] numberArray2 = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] numberArray3 = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String[] numberArray4 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

            for (i = 0; i < numberArray1.length; i++) {

                if ((numberArray4[a] == numberArray4[1]) && (numberArray4[b] == numberArray4[i])) {
                    System.out.println(numberArray2[i]);
                    break;
                }
                if (numberArray4[a] == numberArray4[i]) {
                    System.out.println(numberArray3[i]);
                    if ((numberArray4[b] == numberArray4[i])) {
                        System.out.println(numberArray1[i]);
                        break;
                    }
                }
                if ((numberArray4[b] == numberArray4[i])) {
                    System.out.println(numberArray1[i]);
                    break;
                }
            }
        } while (true);
    }
}
