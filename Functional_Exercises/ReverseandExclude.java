package Functional_Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseandExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());


        Collections.reverse(numbers);
        Predicate<Integer> chekIsDivisible = number -> number % n == 0;
        numbers.removeIf(chekIsDivisible);
        numbers.forEach(element -> System.out.print(element + " "));


    }
}
