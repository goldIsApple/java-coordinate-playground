package coordinate;

import java.util.Objects;

public class Coordinate {
    public static final int MIN = 0;
    public static final int MAX = 24;
    private final int number;

    public Coordinate(final int number) {
        validate(number);
        this.number=number;
    }

    private void validate(final int number) {
        if( number > MAX || number < MIN ){
            throw new IllegalArgumentException("좌표 범위는 0~24 입니다.");
        }
    }
    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate pointer = (Coordinate) o;
        return number == pointer.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
