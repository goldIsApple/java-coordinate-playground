package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointerTest {

    @Test
    void 좌표_생성() {
        Pointer coordinate = new Pointer(1, 3);
        Assertions.assertThat(coordinate).isEqualTo(new Pointer(1, 3));
    }

    @Test
    void 좌표_X_Y_길이() {
        Pointer pointer1 = new Pointer(1, 3);
        Pointer pointer2 = new Pointer(2, 6);
        Assertions.assertThat(pointer1.getDistanceX(pointer2)).isEqualTo(1);
        Assertions.assertThat(pointer1.getDistanceY(pointer2)).isEqualTo(3);
    }
}
