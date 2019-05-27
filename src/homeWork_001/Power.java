package homeWork_001;

public class Power {

    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }

    private static int power(int a, int b) {

        int result = a;

        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
