package Sets_And_Mapsdvanced_Exercises;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map< String, Set<String>> players = new LinkedHashMap<>();

        while (!input.endsWith("JOKER")){
            String name = input.split(": ")[0];
            String  cards = input.split(": ")[1];
            String [] cardParts = cards.split(", ");

            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(cardParts));

            if (!players.containsKey(name)){
                players.put(name,cardsSet);
            } else {
                Set<String> currentCards = players.get(name);
                currentCards.addAll(Arrays.asList(cardParts));
                players.put(name,currentCards);
            }

            input = scanner.nextLine();
        }

       players.entrySet().forEach(entry -> {
       String name = entry.getKey();
       Set<String> cards = entry.getValue();
       int points = getSumByPoints(cards);
           System.out.printf("%s: %d%n",name,points);
       });
    }

    private static int getSumByPoints(Set<String> value) {

        Map<Character,Integer> symbolValues = getSymbolPoints();
        int sumPoints = 0;

        int points = 0;
        for (String element: value) {
            if (element.endsWith("10")){
                char type = element.charAt(2);
                points = symbolValues.get(type) * 10;
            } else {
                char power = element.charAt(0);
                char type = element.charAt(1);
                points = symbolValues.get(power) * symbolValues.get(type);
            }
            sumPoints += points;
        }
        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolPoints() {
        Map<Character,Integer> characterValues = new HashMap<>();
        characterValues.put('2',2);
        characterValues.put('3',3);
        characterValues.put('4',4);
        characterValues.put('5',5);
        characterValues.put('6',6);
        characterValues.put('7',7);
        characterValues.put('8',8);
        characterValues.put('9',9);
        characterValues.put('J',11);
        characterValues.put('Q',12);
        characterValues.put('K',13);
        characterValues.put('A',14);
        characterValues.put('S',4);
        characterValues.put('H',3);
        characterValues.put('D',2);
        characterValues.put('C',1);

        return characterValues;
    }
}
