package Lab.HotelReservation;

public class PriceCalculator {
    public static double calculateFinalPrise(double pricePerDay,
                                             int numbersOfDay, Season season,
                                             DiscountType discountType){
        double price = pricePerDay * numbersOfDay;
        price = price * season.getMultiplier();
        price = price * (100 - discountType.getDiscount()) /100.0;
        return price;
    }
}
