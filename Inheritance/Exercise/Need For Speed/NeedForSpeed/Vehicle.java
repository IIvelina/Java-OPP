package NeedForSpeed;

public class Vehicle {

    //•	DEFAULT_FUEL_CONSUMPTION – final static double (constant)
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    //•	fuelConsumption –double
    private double fuelConsumption; //разход за 1км
    //•	fuel – double
    private double fuel; //налични литри гориво
    //•	horsePower – int
    private int horsePower; //конски сили

    //•	A public constructor which accepts (fuel, horsePower)
    // and set the default fuel consumption on the field fuelConsumption


    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    //•	Getters and Setters for the fields
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    //•	void drive(double kilometers)
    //o	The drive method should have the functionality to reduce the fuel based on the traveled kilometers and fuel consumption. Keep in mind that you can drive the vehicle only if you have enough fuel to finish the driving.
    //The default fuel consumption for Vehicle is 1.25. Some of the classes have different default fuel consumption:
    //•	SportCar – DEFAULT_FUEL_CONSUMPTION = 10
    //•	RaceMotorcycle – DEFAULT_FUEL_CONSUMPTION = 8
    //•	Car – DEFAULT_FUEL_CONSUMPTION = 3

    public void drive(double kilometers){
        //1.колко гориво ще изгорим ако минем kilometers
        double consumedFuel = this.getFuelConsumption() * kilometers;
        //2. проверка дали горивото, което имаме ще стигне
        if (this.getFuel() >= consumedFuel){
            //пътуваме kilometers
            double leftFuel = this.getFuel() - consumedFuel;
            this.setFuel(leftFuel);

        }
    }
}
