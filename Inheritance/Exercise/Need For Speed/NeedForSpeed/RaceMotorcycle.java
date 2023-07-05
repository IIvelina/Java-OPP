package NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{
//Some of the classes have different default fuel consumption:
//RaceMotorcycle – DEFAULT_FUEL_CONSUMPTION = 8

    private static final double DEFAULT_FUEL_CONSUMPTION = 8;
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
