package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> inhabitants = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] parts = input.split("\\s+");

            Identifiable next = null;
            if (parts.length == 2){
                //ROBOT
                //"{model} {id}"
               next = new Robot(parts[1], parts[0]);
            }else {
                //citizens
                //"{name} {age} {id}"
               next = new Citizen(parts[0], Integer.parseInt(parts[1]), parts[2]);
            }

            inhabitants.add(next);

            input = scanner.nextLine();
        }

        String badIdSuffix = scanner.nextLine();

        inhabitants
                .stream()
                .map(Identifiable::getId)
                .filter(id -> id.endsWith(badIdSuffix))
                .forEach(id -> System.out.println(id));
    }
}
