package Functional_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] range = scanner.nextLine().split("\\s+");
        int lower = Integer.parseInt(range[0]);
        int upper = Integer.parseInt(range[1]);


        List<Integer> listNumbers = new ArrayList<>();


        for (int i = lower; i <= upper ; i++) {
            int currentNumber = lower;

            listNumbers.add(currentNumber);

            lower++;
        }

        String command = scanner.nextLine();

        Predicate<Integer> filterPredicate;
        if (command.equals("odd")){
            filterPredicate = e -> e % 2 != 0;
        } else {
            filterPredicate = e -> e % 2 == 0;
        }
       List<Integer> neededNumbers =  listNumbers.stream().filter(filterPredicate).collect(Collectors.toList());
        neededNumbers.stream().forEach(e -> System.out.printf("%d ",e));
    }
}
