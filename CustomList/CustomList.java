package CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomList <T extends Comparable<T>>{
    private List<T> elementsList;

    public CustomList(){
        this.elementsList = new ArrayList<>();
    }
    public void add (T element){
        this.elementsList.add(element);
    }

    public T remove (int index){
        return this.elementsList.remove(index);
    }
    public boolean contains (T element){
        return this.elementsList.contains(element);
    }

    public void swap (int firstIndex,int secondIndex){
        T firstNumber = this.elementsList.get(firstIndex);
        T secondNumber = this.elementsList.get(secondIndex);

        this.elementsList.set(firstIndex,secondNumber);
        this.elementsList.set(secondIndex,firstNumber);
    }

    public int countGreaterThan (T elementToCompare){
        int count = 0;
        for (T element: elementsList) {
            if (element.compareTo(elementToCompare) > 0){
                count++;
            }
        }
        return count;
    }

    public T getMax (){
        return this.elementsList.stream().max(Comparator.naturalOrder()).get();
    }
    public T getMin (){
        return Collections.min(elementsList);
    }
     public void print (){
         for (T element: elementsList) {
             System.out.println(element);
         }
     }

     public void sort(){
        this.elementsList.sort((e1,e2) -> e1.compareTo(e2));
     }
}
