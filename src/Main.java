import car.Car;
import car.CargoCar;
import car.PassengerCar;
import car.SportCar;
import util.CompareFuelConsumption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        double totalCost = 0;
        ArrayList<Car> taxiService = new ArrayList<>();

        taxiService.add(new PassengerCar("Kia Rio", 200, 2150, 80000, 3, 4));
        taxiService.add(new PassengerCar("Mercedes AMG C 43 Coupe", 190, 2000, 120000, 1.7,2));
        taxiService.add(new CargoCar("ГАЗ-3302", 140, 2100, 20000, 2.7, 1660));
        taxiService.add(new CargoCar("УАЗ 2206", 120, 1900, 9000, 2.4, 1110));
        taxiService.add(new PassengerCar("Audi A5", 210, 2300, 90000, 2.3, 2));
        taxiService.add(new SportCar("BMW M8 competition", 263, 1900, 155000, 2.5,2));
        taxiService.add(new SportCar("Koenigsegg Jesko Absolut", 472, 1320, 3800000, 4.0, 2.8));

        System.out.println(taxiService.get(0).toString() + "\n");

        for (Car car : taxiService) {
            totalCost += car.getCost();
        }
        System.out.println("total cost: " + totalCost + "$" + "\n");

        Comparator fuelConsumptionComparator = new CompareFuelConsumption();
        Collections.sort(taxiService, fuelConsumptionComparator);// from min to max

        System.out.print("cars from min fuel consumption to max: ");
        for (Car car : taxiService) {
            System.out.print(car.getModel() + ",  ");
        }
        System.out.println("\n");

        System.out.print("cars from the range of cost: ");
        for (Car car : taxiService) {
            if ( (car.getMaxSpeed() > 200) && (car.getMaxSpeed() < 215) ) {
                System.out.println(car.getModel());
            }
        }
    }
}
