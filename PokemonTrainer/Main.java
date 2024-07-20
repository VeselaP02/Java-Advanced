package PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Pokemon>> pokemonByTrainers = new LinkedHashMap<>();

        while (!input.equals("Tournament")){
            String [] inputData = input.split("\\s+");
            String trainerName = inputData[0];
            String pokemonName = inputData[1];
            String element = inputData[2];
            int health = Integer.parseInt(inputData[3]);

            Pokemon pokemon = new Pokemon(pokemonName,element,health);
            if (!pokemonByTrainers.containsKey(trainerName)) {
                pokemonByTrainers.put(trainerName, new ArrayList<>());
                pokemonByTrainers.get(trainerName).add(pokemon);
            } else {
                pokemonByTrainers.get(trainerName).add(pokemon);
            }

            input = scanner.nextLine();
        }
        List<Trainer> trainerList = pokemonByTrainers.entrySet().stream()
                .map(t -> new Trainer(t.getKey(),t.getValue())).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")){
            for (Trainer trainer: trainerList) {
                trainer.commandIsExecuting(command);
            }

            command = scanner.nextLine();
        }
        trainerList.stream().sorted(Comparator.comparingInt(Trainer::getNumberOfBadges).reversed()).forEach(System.out::println);
    }
}
