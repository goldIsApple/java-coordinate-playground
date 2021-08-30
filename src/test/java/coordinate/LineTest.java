package coordinate;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void 두_점_사이_거리_계산() {
        Pointer pointer1 = new Pointer(10, 10);
        Pointer pointer2 = new Pointer(14, 15);
        Line lineLength = new Line(pointer1,pointer2);
        Assertions.assertThat(lineLength.answer()).isEqualTo(6.403124, Offset.offset(0.000001));
    }

    @Test
    void 두_점_사이_거리_정보() {
        Pointer pointer1 = new Pointer(10, 10);
        Pointer pointer2 = new Pointer(14, 15);
        Line lineLength = new Line(pointer1,pointer2);
        Assertions.assertThat(lineLength.answerInfo()).isEqualTo("두 점 사이 거리는 6.403124");
    }
}
