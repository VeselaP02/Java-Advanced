package lake;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{

    private List<Integer> lake;

    public Lake(Integer... elements) {
        this.lake = List.of(elements);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
    public class Frog implements Iterator<Integer>{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < lake.size();
        }

        @Override
        public Integer next() {
            int element =lake.get(index);
            index += 2;
            boolean isFirstRoundFinished = false;

            if (index >= lake.size() && !isFirstRoundFinished){
                index = 1;
                isFirstRoundFinished = true;
            }
            return element;
        }
    }
}
