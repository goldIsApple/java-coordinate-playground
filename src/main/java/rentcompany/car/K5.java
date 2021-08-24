package rentcompany.car;

public class K5 extends AbstractCar{
    private final static double DISTANCE_PER_LITER=13;

    public K5(double tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
