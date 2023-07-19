import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String ranges = scanner.nextLine();

        int start = Integer.parseInt(ranges.split(" ")[0]);
        int end = Integer.parseInt(ranges.split(" ")[1]);

        System.out.printf("Range: [%d...%d]%n", start, end);
        while (true){
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                if (number >= start && number <= end){
                    System.out.printf("Valid number: %d%n", number);
                    break;
                }else {
                    System.out.printf("Invalid number: %d%n", number);
                }
            }catch (NumberFormatException e){
                System.out.printf("Invalid number: %s%n", input);
            }
        }
    }
}
