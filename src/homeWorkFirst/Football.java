package homeWorkFirst;

public class Football {

    public static void main(String[] args) {
        System.out.println(matchResult(5, 2, 1, 2));
    }

    private static int matchResult(int firstResult, int secondResult,
                                   int firstBet, int secondBet) {
        return firstResult == firstBet && secondResult == secondBet ? 2
                : ((firstResult > secondResult && firstBet > secondBet) ||
                (firstResult < secondResult && firstBet < secondBet)) ? 1 : 0;
    }
}
