package util;

import java.util.Comparator;
import cars.*;

public class CompareFuelConsumption implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        if (o1.getFuelConsumption() > o2.getFuelConsumption()) {
            return 1;
        } else if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
            return -1;
        }
        return 0;
    }
}
