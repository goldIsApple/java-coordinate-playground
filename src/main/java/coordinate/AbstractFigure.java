package coordinate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractFigure implements Figure {

    private final List<Pointer> pointers;

    public List<Pointer> getPointers() {
        return Collections.unmodifiableList(pointers);
    }

    public AbstractFigure(Pointer[] pointer) {
        this.pointers = createPointers(pointer);
    }


    public Pointer getPointer(int index) {
        int size = pointers.size();
        if(size < index || index < 0){
            throw new IllegalArgumentException("인덱스 범위를 벗어났습니다.");
        }
        return pointers.get(index);
    }

    private List<Pointer> createPointers(Pointer[] pointerArr){
        List<Pointer> pointers = new ArrayList<>();
        for (Pointer pointer : pointerArr) {
            pointers.add(pointer);
        }
        return pointers;
    }
}
