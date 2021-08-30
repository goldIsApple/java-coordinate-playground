package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    @Test
    void 직사각형_검증() {
        Pointer pointer1 = new Pointer(10, 10);
        Pointer pointer2 = new Pointer(22, 10);
        Pointer pointer3 = new Pointer(20, 18);
        Pointer pointer4 = new Pointer(10, 18);
        assertThrows(IllegalArgumentException.class, () -> new Square(pointer1, pointer2, pointer3, pointer4));
    }
    @Test
    void 직사각형_넓이() {
        Pointer pointer1 = new Pointer(10, 10);
        Pointer pointer2 = new Pointer(22, 10);
        Pointer pointer3 = new Pointer(22, 18);
        Pointer pointer4 = new Pointer(10, 18);
        Square square = new Square(pointer1, pointer2, pointer3, pointer4);
        Assertions.assertThat(square.answer()).isEqualTo(96);
    }
    @Test
    void 직사각형_넓이_정보() {
        Pointer pointer1 = new Pointer(10, 10);
        Pointer pointer2 = new Pointer(22, 10);
        Pointer pointer3 = new Pointer(22, 18);
        Pointer pointer4 = new Pointer(10, 18);
        Square square = new Square(pointer1, pointer2, pointer3, pointer4);
        Assertions.assertThat(square.answerInfo()).isEqualTo("사각형 넓이는 96");
    }
}
