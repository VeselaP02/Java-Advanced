package SetsAndMaps_Advanced_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        Collections.sort(numbers);
        Collections.reverse(numbers);
        if (numbers.size() < 3){
            for (int number: numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        } else {
            int count = 0;
            for (int i = 0; i < numbers.size() ; i++) {
                int currentNumber = numbers.get(i);
                if (count < 3){
                    System.out.print(currentNumber + " ");
                }
                count++;
                if (i == 2){
                    break;
                }

            }
        }
    }
}
