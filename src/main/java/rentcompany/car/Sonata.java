package rentcompany.car;

public class Sonata extends AbstractCar{

    private final static double DISTANCE_PER_LITER=10;

    public Sonata(double tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
