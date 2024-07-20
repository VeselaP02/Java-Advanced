package Functional_Exercises;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      List<Integer> numbers = (List<Integer>) Arrays.stream(scanner.nextLine().split(" "))
              .map(Integer::parseInt).collect(Collectors.toList());

      Function<List<Integer>, Integer> minNumber = list -> Collections.min(list);
        System.out.println(minNumber.apply(numbers));

    }
}
