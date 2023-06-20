package Lab.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
         */

        String[] input = scanner.nextLine().split("\\s+");
        int bottomLeftX = Integer.parseInt(input[0]);
        int bottomLeftY = Integer.parseInt(input[1]);
        int topRightX = Integer.parseInt(input[2]);
        int topRightY = Integer.parseInt(input[3]);

       Point bottomLeft = new Point(bottomLeftX, bottomLeftY);

       Point topRight = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] pontCoordinates = scanner.nextLine().split("\\s+");
            int first = Integer.parseInt(pontCoordinates[0]);
            int second = Integer.parseInt(pontCoordinates[1]);

            Point current = new Point(first, second);
            System.out.println(rectangle.contains(current));
        }
    }
}
