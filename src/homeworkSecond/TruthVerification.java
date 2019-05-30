package homeworkSecond;

public class TruthVerification {

    public static void main(String[] args) {
        System.out.println(booleanExpression(true, false,
                false, true));
    }

    private static boolean booleanExpression(boolean firstArgument, boolean secondArgument,
                                             boolean thirdArgument, boolean fourthArgument) {
        return (firstArgument | secondArgument | thirdArgument | fourthArgument) &&
                !(firstArgument & secondArgument & thirdArgument & fourthArgument) &&
                !(firstArgument ^ secondArgument ^ thirdArgument ^ fourthArgument);
    }
}
