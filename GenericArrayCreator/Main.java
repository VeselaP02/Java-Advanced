package GenericArrayCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayCreator arrayCreator = new ArrayCreator();

        String [] stringCreator = ArrayCreator.create(3,"Ivan");
        Integer [] creator = ArrayCreator.create(Integer.class,7,17);

    }
}
