package rentcompany.car;

public abstract class AbstractCar implements Car{

    private final double tripDistance;
    private final double distancePerLiter;

    public AbstractCar(double tripDistance, double distancePerLister) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = distancePerLister;
    }

    @Override
    public double getChargeQuantity() {
        return tripDistance / distancePerLiter;
    }
}
