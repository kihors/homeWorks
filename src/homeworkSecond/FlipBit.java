package homeworkSecond;

public class FlipBit {

    public static void main(String[] args) {
        System.out.println(flipBit(4, 4));
    }

    private static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1);
    }
}
