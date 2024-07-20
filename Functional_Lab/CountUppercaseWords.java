package Functional_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] text = scanner.nextLine().split("\\s+");
        Predicate<String> isUppercaseWord = word -> Character.isUpperCase(word.charAt(0));

       List<String> uppersWords =  Arrays.stream(text).filter(isUppercaseWord).collect(Collectors.toList());

        System.out.println(uppersWords.size());

        uppersWords.stream().forEach(word -> System.out.println(word));
    }
}
