package Lab;

import java.util.Scanner;

public class RhombusOfStarsWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int starCount = 1; starCount <= size; starCount++) {
            putSpaces(size, starCount);
            putStars(starCount);
            System.out.println();
        }
        for (int starCount = size - 1; starCount >= 1; starCount--) {
            putSpaces(size, starCount);
            putStars(starCount);
            System.out.println();
        }
    }

    private static void putStars(int starCount) {
        for (int i = 1; i <= starCount; i++) {
            System.out.print("* ");
        }
    }

    private static void putSpaces(int size, int starCount) {
        for (int i = 0; i < size - starCount; i++) {
            System.out.print(" ");
        }
    }
}
