package homeworkEleventh;

public class TestCallerClassApp {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static String getCallerClassAndMethodName() {
        StackTraceElement[] traceElements = new Throwable().getStackTrace();
        if (traceElements.length > 2) {
            return traceElements[2].getClassName() + "#" + traceElements[2].getMethodName();
        }
        return null;
    }
}
