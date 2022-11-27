package cars;

public class CargoCar extends Car{
    private double transportedWeight;

    public CargoCar(String model, double speed, double weight, double cost, double fuelConsumption, double transportedWeight) {
        super(model, speed, weight, cost, fuelConsumption);
        this.transportedWeight = transportedWeight;
    }

    public void setTransportedWeight(double transportedWeight) {
        this.transportedWeight = transportedWeight;
    }
    public double getTransportedWeight() {
        return this.transportedWeight;
    }

    public String toString() {
        return super.toString() + "\ntransported weight: " + this.transportedWeight + " kg";
    }
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            if(!(obj instanceof CargoCar)) return false;
            return transportedWeight == ((CargoCar)obj).transportedWeight;
        } else {
            return false;
        }
    }
}