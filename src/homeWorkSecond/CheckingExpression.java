package homeWorkSecond;

public class CheckingExpression {

    public static void main(String[] args) {
        System.out.println(doubleExpression(2.02, 5.03, 7.05));
    }

    private static boolean doubleExpression(double firstValue, double secondValue, double sum) {
        double permissibleError = 0.0001;
        return Math.abs(firstValue + secondValue - sum) < permissibleError;
    }
}
