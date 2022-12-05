package service;

import car.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TaxiService {
    public double calculateTotalCost(ArrayList<Car> taxiService) {
        double totalCost = 0;

        for (Car car : taxiService) {
            totalCost += car.getCost();
        }
        return totalCost;
    }

    public void sortByFuelConsumption(ArrayList<Car> taxiService, Comparator fuelConsumptionComparator) {
        Collections.sort(taxiService, fuelConsumptionComparator);// from min to max
    }

    public void outputCars(ArrayList<Car> taxiService) {
        for (Car car : taxiService) {
            System.out.print(car.getModel() + ",  ");
        }
    }

    public void findCarInRange(ArrayList<Car> taxiService, double leftLimit, double rightLimit) {
        for (Car car : taxiService) {
            if ( (car.getMaxSpeed() > leftLimit) && (car.getMaxSpeed() < rightLimit) ) {
                System.out.println(car.getModel());
            }
        }
    }
}
