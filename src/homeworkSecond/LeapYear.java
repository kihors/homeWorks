package homeworkSecond;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(leapYearCount(2019));
    }

    private static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}
