package GenericsBox;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>>{
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void  add (T element){
        this.elements.add(element);
    }

    public void swap (int firstIndex,int secondIndex){
        T firstNumber = this.elements.get(firstIndex);
        T secondNumber = this.elements.get(secondIndex);

        this.elements.set(firstIndex,secondNumber);
        this.elements.set(secondIndex,firstNumber);
    }

    public int counter (T elementToCompare){
        int count = 0;
        for (T element: elements) {
            if (element.compareTo(elementToCompare) > 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString (){
        StringBuilder builder = new StringBuilder();
        for (T element: elements) {
            builder.append(element.getClass().getName() + ": ").append(element).append(System.lineSeparator());
        }
        return builder.toString();
    }

}
