package Exercise.CardSuit;

public class Main {
    public static void main(String[] args) {

        //всички изброени елементи в CardSuit
        // за всеки изброен елемент -> отпечатвам позиция и стойност

        //Card Suits:
        //Ordinal value: 0; Name value: CLUBS

        System.out.println("Card Suits:");

        CardSuits[] cardSuits = CardSuits.values();

        for (CardSuits cardSuit : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    cardSuit.ordinal(), cardSuit.toString());
        }
    }
}
