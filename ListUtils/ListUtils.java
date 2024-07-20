package ListUtils;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMAX(List<T> listMax){
        if (listMax.isEmpty()){
            throw new IllegalArgumentException();
        }
       return Collections.max(listMax);
    }

    public static <T extends Comparable<T>> T getMin (List<T> listMin){
        if (listMin.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Collections.min(listMin);
    }
}
