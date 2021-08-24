package rentcompany;

import java.util.ArrayList;
import java.util.List;
import rentcompany.car.Car;

public class RentCompany {

    private static final String FORMAT = "%s : %.0f%s";
    private static final String LITTER = "리터";
    private static final String NEW_LINE = System.getProperty("line.separator");
    private List<Car> cars = new ArrayList<>();

    private RentCompany(){}

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        cars.forEach(
                 car->{
                     sb.append(String.format(FORMAT, car.getName(), car.getChargeQuantity(), LITTER));
                     sb.append(NEW_LINE);
                 }
         );
        return sb.toString();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
