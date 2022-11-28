package car;

public class SportCar extends Car {
    private double acceleratingTime;
    public SportCar(String model, double speed, double weight, double cost, double fuelConsumption, double acceleratingTime) {
        super(model, speed, weight, cost, fuelConsumption);
        this.acceleratingTime = acceleratingTime;
    }

    public void setAcceleratingTime(double acceleratingTime) {
        this.acceleratingTime = acceleratingTime;
    }
    public double getAcceleratingTime() {
        return this.acceleratingTime;
    }


}
