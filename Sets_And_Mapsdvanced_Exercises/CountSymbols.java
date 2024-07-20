package Sets_And_Mapsdvanced_Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character,Integer> results = new TreeMap<>();

        for (int i = 0; i < input.length() ; i++) {
            char currentSymbol = input.charAt(i);

            if (!results.containsKey(currentSymbol)){
                results.put(currentSymbol,1);
            } else {
                int currentTime = results.get(currentSymbol);
                results.put(currentSymbol,currentTime + 1);
            }
        }
       results.entrySet().forEach(entry -> System.out.println((char)entry.getKey() + ":" + " " + entry.getValue() +
               " time/s"));
    }
}
