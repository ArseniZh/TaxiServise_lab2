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

    public String toString() {
        return super.toString() + "\naccelerating time from 0 to 100(km/h): " + this.acceleratingTime + " sec";
    }
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            if(!(obj instanceof SportCar)) return false;
            return acceleratingTime == ((SportCar)obj).acceleratingTime;
        } else {
            return false;
        }
    }
}
