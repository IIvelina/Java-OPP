package NeedForSpeed;

public class SportCar extends Car{
//Some of the classes have different default fuel consumption:
// SportCar – DEFAULT_FUEL_CONSUMPTION = 10
    private static final double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
