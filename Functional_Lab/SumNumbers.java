package Functional_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(", ");
        System.out.printf("Count = %d%n",numbers.length);
        BiFunction<Integer,String,Integer> sumOfNumbers = (x,y) -> x + Integer.parseInt(y);
        Function<String,Integer> returnInt = e -> Integer.parseInt(e);

       List<Integer> numbersParse  = Arrays.stream(numbers).map(returnInt).collect(Collectors.toList());


       int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum = sumOfNumbers.apply(sum,numbers[i]);
        }

        System.out.printf("Sum = %d%n",sum);
    }
}
