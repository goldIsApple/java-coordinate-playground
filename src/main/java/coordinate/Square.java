package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Square extends AbstractFigure {

    private static final String OUTPUT_SQUARE_INFO = "사각형 넓이는 %.0f";
    //public static final int SQUARE_POINTER_COUNT = 4;
    public Square(Pointer... pointer) {
        super(pointer);
        validate(getPointers());
    }

    private void validate(List<Pointer> pointers) {
        Set<Integer> xValuesOfPoint = getUniqueValues(pointers, Pointer::getX);
        Set<Integer> yValuesOfPoint = getUniqueValues(pointers, Pointer::getY);

        if(xValuesOfPoint.size() != 2 || yValuesOfPoint.size()!= 2){
            throw new IllegalArgumentException("직사각형 이 아닙니다.");
        }
    }

    private int getDistance(Set<Integer> valuesOfPoint) {
        List<Integer> values = new ArrayList<>(valuesOfPoint);
        return Math.abs(values.get(0) - values.get(1));
    }

    private Set<Integer> getUniqueValues(List<Pointer> pointers, Function<Pointer,Integer> function) {
        return pointers.stream()
                .map(function)
                .collect(Collectors.toSet());
    }

    @Override
    public double answer() {
        List<Pointer> pointers = getPointers();

        Set<Integer> xValuesOfPoint = getUniqueValues(pointers,Pointer::getX);
        Set<Integer> yValuesOfPoint = getUniqueValues(pointers,Pointer::getY);

        int x = getDistance(xValuesOfPoint);
        int y = getDistance(yValuesOfPoint);

        return (double) x * y;
    }

    @Override
    public String answerInfo() {
        return String.format(OUTPUT_SQUARE_INFO, answer());
    }
}
