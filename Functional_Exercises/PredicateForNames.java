package Functional_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        String [] names = scanner.nextLine().split("\\s+");

        Predicate<String> checkLength = name -> name.length() <= n;
        Arrays.stream(names).filter(checkLength).forEach(name -> System.out.println(name));
    }
}
