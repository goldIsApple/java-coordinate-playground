package coordinate;

public class Triangle extends AbstractFigure {

    private static final String OUTPUT_TRIANGLE_INFO = "삼각형 넓이는 %.0f";

    public Triangle(Pointer... pointer) {
        super(pointer);
    }

    @Override
    public double answer() {
        Pointer pointer1 = getPointer(0);
        Pointer pointer2 = getPointer(1);
        Pointer pointer3 = getPointer(2);

        double a = pointer1.getLineLength(pointer2);
        double b = pointer2.getLineLength(pointer3);
        double c = pointer1.getLineLength(pointer3);

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String answerInfo() {
        return String.format(OUTPUT_TRIANGLE_INFO, answer());
    }
}
