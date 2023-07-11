package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder browseUrl = new StringBuilder();
        for (String currentUrl : urls) {
            boolean contains = containsDigit(currentUrl);
            if (contains == true) {
                browseUrl.append("Invalid URL!").append(System.lineSeparator());
                continue;
            } else {
                browseUrl.append("Browsing: ").append(currentUrl).append("!").append(System.lineSeparator());
            }
        }
        return browseUrl.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder callNumber = new StringBuilder();
        for (String currentNumber : numbers) {
            boolean contains = containsLetter(currentNumber);
            if (contains == true){
                callNumber.append("Invalid number!").append(System.lineSeparator());
                continue;
            }else {
                callNumber.append("Calling... ").append(currentNumber).append(System.lineSeparator());
            }
        }
        return callNumber.toString().trim();
    }

    public static boolean containsLetter(String currentNumber){
        for (int i = 0; i < currentNumber.length(); i++) {
            if (Character.isLetter(currentNumber.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean containsDigit(String currentUrl){
        for (int i = 0; i < currentUrl.length(); i++) {
            if (Character.isDigit(currentUrl.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
