package homeWorkSecond;

public class TruthVerification {

    public static void main(String[] args) {
        System.out.println(booleanExpression(true, false,
                false, true));
    }

    private static boolean booleanExpression(boolean firstArgument, boolean secondArgument,
                                             boolean thirdArgument, boolean fourthArgument) {
        return (firstArgument ? 1 : 0) + (secondArgument ? 1 : 0) +
                (thirdArgument ? 1 : 0) + (fourthArgument ? 1 : 0) == 2;
    }
}
