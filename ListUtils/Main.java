package ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(19);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(12);

        System.out.println(ListUtils.getMAX(list));
        System.out.println(ListUtils.getMin(list));
    }
}
