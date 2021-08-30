package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoordinateTest {

    @Test
    void 좌표_생성() {
        Coordinate pointer = new Coordinate(1);
        Assertions.assertThat(pointer).isEqualTo(new Coordinate(1));
    }

    @Test
    void 좌표_범위_0_24_검증() {
        assertThrows(IllegalArgumentException.class, () -> new Coordinate(-1));
        assertThrows(IllegalArgumentException.class, () -> new Coordinate(25));
    }
}
