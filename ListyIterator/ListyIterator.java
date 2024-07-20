package ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterator<String> {
    private List<String> collections;
    private int index;

    public List<String> getCollections() {
        return collections;
    }

    public void setCollections(List<String> collections) {
        this.collections = collections;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ListyIterator(List<String> collections) {
        this.collections = collections;
        if (collections.isEmpty()){
            this.index = -1;
        } else {
            this.index = 0;
        }
    }

    public boolean move (){
        if (hasNext()){
            this.index++;
            return true;
        }
        return false;
    }

    public void print () throws Exception {
        if (collections.isEmpty()){
            throw new Exception("Invalid Operation!");
        } else {
            System.out.println(collections.get(this.index));
        }
    }
    public boolean hasNext (){
        return  this.index < this.collections.size() - 1;
    }

    @Override
    public String next() {
        return collections.get(index++);
    }

    public void printAll (List<String> collections){
        for (String el: collections) {
            System.out.print(el +" ");
        }
        System.out.println();
    }
}
