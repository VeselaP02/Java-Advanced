package Functional_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public interface ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<Integer,List<Integer>,Boolean> divisibleByNumber = ((number,list) -> {
            for (int numberInList: list) {
                if (number % numberInList != 0){
                    return false;
                }
            }
            return true;
        });

        for (int number = 1; number < n ; number++) {
            if (divisibleByNumber.apply(number,numbers)){
                System.out.print(number + " ");
            }

        }
    }
}
