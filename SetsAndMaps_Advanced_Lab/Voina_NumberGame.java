package SetsAndMaps_Advanced_Lab;

import java.util.*;

public class Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Set<Integer> firstSetCards = new LinkedHashSet<>();
        Set<Integer> secondSetCards = new LinkedHashSet<>();

        for (int firstNumber:firstPlayerCards) {
            firstSetCards.add(firstNumber);
        }
        for (int secondNumber:secondPlayerCards) {
            secondSetCards.add(secondNumber);
        }

        int gameEnd = 1;
        while ( gameEnd <= 50 || firstSetCards.size() == 0 || secondSetCards.size() == 0) {
            int firstNumber = firstSetCards.iterator().next();
            firstSetCards.remove(firstNumber);

            int secondNumber = secondSetCards.iterator().next();
            secondSetCards.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstSetCards.add(firstNumber);
                firstSetCards.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondSetCards.add(firstNumber);
                secondSetCards.add(secondNumber);
            }
            gameEnd++;
        }
        if ( firstSetCards.size() < secondSetCards.size()){
            System.out.println("Second player win!");
        } else if (firstSetCards.size() > secondSetCards.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
