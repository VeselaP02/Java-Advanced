package Functional_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        List<String> names = new ArrayList<>();

        for (int i = 0; i < input.length ; i++) {
            String currentName = input[i];

            names.add(currentName);
        }
        Consumer<String> printName = name -> System.out.println(name);
        names.stream().forEach(printName);
    }
}
