package coordinate;

import java.util.Objects;

public class Pointer {

    private final Coordinate x;
    private final Coordinate y;

    public Pointer(int x, int y) {
        this.x = new Coordinate(x);
        this.y = new Coordinate(y);
    }

    public double getLineLength(Pointer point) {
        double distanceX = this.getDistanceX(point);
        double distanceY = this.getDistanceY(point);
        return Math.sqrt( Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }



    public double getDistanceX(Pointer point) {
        return getDistance(this.x.getNumber(),point.x.getNumber());
    }

    public double getDistanceY(Pointer point) {
        return getDistance(this.y.getNumber(),point.y.getNumber());
    }
    public int getX() {
        return x.getNumber();
    }

    public int getY() {
        return y.getNumber();
    }

    private double getDistance(int number1, int number2) {
        return Math.abs(number1 - number2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pointer that = (Pointer) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }



}
