package coordinate;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void 삼각형_넓이() {
        Pointer pointer1 = new Pointer(10, 10);
        Pointer pointer2 = new Pointer(14, 10);
        Pointer pointer3 = new Pointer(10, 13);
        Triangle triangle = new Triangle(pointer1, pointer2, pointer3);
        assertThat(triangle.answer()).isEqualTo(6);
    }
}