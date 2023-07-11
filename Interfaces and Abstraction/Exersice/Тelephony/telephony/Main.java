package telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phoneNumbersArr = scanner.nextLine().split("\\s+");
        String[] urlsArr = scanner.nextLine().split("\\s+");

        scanner.close();

        List<String> numbers = Arrays.asList(phoneNumbersArr);
        List<String> urls = Arrays.asList(urlsArr);
        Smartphone smartphone = new Smartphone(numbers, urls);

        String call = smartphone.call();
        String browse = smartphone.browse();

        System.out.println(call);
        System.out.println(browse);
    }
}
