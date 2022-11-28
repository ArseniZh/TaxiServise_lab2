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


}