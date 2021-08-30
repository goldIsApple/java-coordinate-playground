package coordinate;

public class Line extends AbstractFigure {

    private static final String OUTPUT_LINE_INFO = "두 점 사이 거리는 %.6f";
    public Line(Pointer... pointer) {
        super(pointer);
    }


    @Override
    public double answer() {
        return getPointer(0).getLineLength(getPointer(1));
    }

    @Override
    public String answerInfo() {
        return String.format(OUTPUT_LINE_INFO, answer());
    }
}
