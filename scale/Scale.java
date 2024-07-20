package scale;

public class Scale <T extends Comparable<T>>{
    private T right;
    private T left;

    public Scale(T right, T left) {
        this.right = right;
        this.left = left;
    }

    public T getHeaver (){
        if (right.compareTo(left) == 0){
            return null;
        } else if (right.compareTo(left) > 0) {
            return right;
        }
        return left;
    }

}
