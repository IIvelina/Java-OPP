package ValidationData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            Person current;

            current = new Person(firstName, lastName, age, salary);
            people.add(current);
        }

        int bonus = Integer.parseInt(scanner.nextLine());

        people.stream()
                .peek(person -> person.increaseSalary(bonus))
                .forEach(p -> System.out.println(p.toString()));
    }
}
