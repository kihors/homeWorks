package homeworkFirst;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        System.out.print("Enter power: ");
        int power = scanner.nextInt();
        System.out.println(pow(number, power));
    }

    private static double pow(int number, int power) {
        double result = 1;
        if (power > 0) {
            for (int i = power; i > 0; i--) {
                result *= number;
            }
        } else if (power < 0) {
            for (int i = power; i < 0; i++) {
                result /= number;
            }
        }
        return result;
    }
}
