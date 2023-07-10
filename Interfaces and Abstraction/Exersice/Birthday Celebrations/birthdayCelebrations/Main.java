package birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> thingsWithBirthday = new ArrayList<>();

        while (!input.equals("End")) {
            String[]data = input.split("\\s+");
            String type = data[0];
            if (type.equals("Citizen")){
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String id = data[3];
                String birthdayDate = data[4];
                //Гражданин {име} {възраст} {id} {рождена дата}
                Citizen citizen = new Citizen(name,age,id,birthdayDate);
                thingsWithBirthday.add(citizen);
            }else if (type.equals("Robot")){
                String model = data[1];
                String id = data[2];
                //Robot {model} {id}
                Robot robot = new Robot(id, model);
            }else if (type.equals("Pet")){
                String name = data[1];
                String birthdayDate = data[2];
                //Pet {name} {birthdate}
                Pet pet = new Pet(name, birthdayDate);
                thingsWithBirthday.add(pet);
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        for (Birthable birthable : thingsWithBirthday) {
            if (birthable.getBirthDate().endsWith(year)){
                System.out.println(birthable.getBirthDate());
            }
        }
    }
}
