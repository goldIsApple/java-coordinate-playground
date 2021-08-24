package rentcompany.car;

public class Avante extends AbstractCar{
    private final static double DISTANCE_PER_LITER=15;

    public Avante(double tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
