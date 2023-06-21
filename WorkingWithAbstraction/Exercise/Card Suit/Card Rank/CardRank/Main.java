package Exercise.CardRank;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        thirteenRanks[] thirteenRank = thirteenRanks.values();

        for (thirteenRanks thirteenRankk : thirteenRank) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    thirteenRankk.ordinal(),
                    thirteenRankk.toString());

        }
    }
}
