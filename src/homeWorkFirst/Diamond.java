package homeWorkFirst;

import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of diamond, please: ");
        int sizeOfRhombus = scanner.nextInt();
        buildDiamond(sizeOfRhombus);
    }

    private static void buildDiamond(int sizeOfRhombus) {
        if (sizeOfRhombus <= 0 || sizeOfRhombus % 2 == 0) {
            System.out.println("You must enter an odd positive number of at least 3");
        } else {
            int centerOfRhombus = sizeOfRhombus / 2;
            for (int i = 0; i < sizeOfRhombus; i ++) {
                for (int j = 0; j < sizeOfRhombus; j++) {
                    if (centerOfRhombus >= i) {
                        if (j >= centerOfRhombus - i && j <= centerOfRhombus + i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (j >= centerOfRhombus + i - sizeOfRhombus + 1 &&
                                j <= (centerOfRhombus - i) + (sizeOfRhombus - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
