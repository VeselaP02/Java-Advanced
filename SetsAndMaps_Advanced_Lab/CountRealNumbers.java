package SetsAndMaps_Advanced_Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> realNumber = new LinkedHashMap<>();

        for (int i = 0; i < number.length ; i++) {
            double currentNumber = number[i];

            if (!realNumber.containsKey(currentNumber)){
                realNumber.put(currentNumber,1);
            } else {
                int currentTimes = realNumber.get(currentNumber);
                realNumber.put(currentNumber, currentTimes + 1);
            }
        }

        realNumber.entrySet().forEach(entry -> System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue()));
    }
}
