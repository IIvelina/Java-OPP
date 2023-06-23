package TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //red -> green -> yellow -> red

        String[] colors = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(scanner.nextLine());

        List<Light> trafficLight = new ArrayList<>();

        for (String color : colors) {
            //създавам крушка с този цвят
            Light light = new Light(TrafficLightSignals.valueOf(color));
            //добавям крушката в светофар
            trafficLight.add(light);
        }

        for (int i = 0; i < n; i++) {
            trafficLight
                    .forEach(light ->{
                        light.changeColor();
                                System.out.print(light.getColor() + " ");
                            });
            System.out.println();
        }
    }
}
