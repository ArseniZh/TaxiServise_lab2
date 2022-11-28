package car;

public abstract class Car {
    private String model = null;
    private double maxSpeed = 0;
    private double carWeight = 0;
    private double cost = 0;
    private double fuelConsumption = 0;

    public Car(String model, double maxSpeed, double carWeight, double cost, double fuelConsumption){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.carWeight = carWeight;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double getMaxSpeed() {
        return this.maxSpeed;
    }
    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }
    public double getCarWeight() {
        return this.carWeight;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return this.cost;
    }
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public String toString() {
        return "model: " + this.model
                + "\nMaxSpeed: " + this.maxSpeed + " km/h"
                + "\ncar weight: " + this.carWeight + " kg"
                + "\ncost: " + this.cost + " $"
                + "\nfuel consumption: " + this.fuelConsumption + " l/100km";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        if (this.model == null || ((Car)obj).model == null
                || this.maxSpeed == 0 || ((Car)obj).maxSpeed == 0
                || this.carWeight == 0 || ((Car)obj).carWeight == 0
                || this.cost == 0 || ((Car)obj).cost == 0
                || this.fuelConsumption == 0 || ((Car)obj).fuelConsumption == 0) {
            return false;
        }
        return (model.equals(((Car)obj).model) && maxSpeed == (((Car)obj).maxSpeed) && carWeight == (((Car)obj).carWeight)
                && cost == (((Car)obj).cost) && fuelConsumption == (((Car)obj).fuelConsumption));
    }
}
