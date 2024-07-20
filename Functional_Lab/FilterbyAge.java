package Functional_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterbyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int peopleCount = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> peopleData = new LinkedHashMap<>();


        for (int i = 1; i <= peopleCount ; i++) {
            String [] input = scanner.nextLine().split(", ");
            String name = input[0];
            int peopleAge = Integer.parseInt(input[1]);

            if (!peopleData.containsKey(name)){
                peopleData.put(name,peopleAge);
            } else {
                peopleData.put(name,peopleAge);
            }
        }
        String condition = scanner.nextLine();
        int limitAge = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        BiPredicate<Integer,Integer> filterPredicate;

        if (condition.equals("younger")){
            filterPredicate = (peopleAge,age) -> peopleAge <= age;
        } else {
            filterPredicate = (peopleAge, age) -> peopleAge >= age;
        }

        Consumer<Map.Entry<String,Integer>> printConsumer;
        if (type.equals("age")){
            printConsumer = person -> System.out.println(person.getValue());
        } else if (type.equals("name")){
            printConsumer = person -> System.out.println(person.getKey());
        } else {
            printConsumer = person -> System.out.printf("%s - %d%n",person.getKey(),person.getValue());
        }

        peopleData.entrySet().stream().filter(person -> filterPredicate.test(person.getValue(),limitAge)).forEach(printConsumer);
    }
}
