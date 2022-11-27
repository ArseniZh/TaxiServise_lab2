import cars.Car;
import cars.CargoCar;
import cars.PassengerCar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        double totalCost = 0;
        ArrayList<Car> taxiService = new ArrayList<>();

        taxiService.add(new PassengerCar("Audi RS e-tron GT", 240, 2150, 120000, 3));
        taxiService.add(new PassengerCar("Mercedes AMG C 43 Coupe", 190, 2000, 120000, 1.7));
        taxiService.add(new CargoCar("ГАЗ-3302", 140, 2100, 20000, 2.7, 1660));
        taxiService.add(new CargoCar("УАЗ 2206", 120, 1900, 9000, 2.4, 1110));
        taxiService.add(new PassengerCar("Audi A5", 210, 2300, 90000, 2.3));
        taxiService.add(new PassengerCar("BMW M8 competition", 263, 1900, 155000, 2.5));

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
