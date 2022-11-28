package car;

public class PassengerCar extends Car{
    private int seatingPlace;
    public PassengerCar(String model, double speed, double weight, double cost, double fuelConsumption, int seatingPlace) {
        super(model, speed, weight, cost, fuelConsumption);
        this.seatingPlace = seatingPlace;
    }

    public void setSeatingPlace(int seatingPlace) {
        this.seatingPlace = seatingPlace;
    }
    public int getSeatingPlace() {
        return this.seatingPlace;
    }

    public String toString() {
        return super.toString() + "\nseating places: " + this.seatingPlace;
    }
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            if(!(obj instanceof PassengerCar)) return false;
            return seatingPlace == ((PassengerCar)obj).seatingPlace;
        } else {
            return false;
        }
    }
}