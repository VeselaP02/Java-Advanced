package PokemonTrainer;

import java.util.List;

public class Trainer {
    private String TrainerName;
    private int numberOfBadges;
    private List<Pokemon> pokemon;

    public Trainer(String name, List<Pokemon> pokemon) {
        this.TrainerName = name;
        this.numberOfBadges = 0;
        this.pokemon = pokemon;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void commandIsExecuting(String command){

        if (isExist(command)){
            numberOfBadges++;
        } else {
            for (int i = 0; i < pokemon.size(); i++) {
                pokemon.get(i).setHealth(pokemon.get(i).getHealth() - 10);

                if (pokemon.get(i).getHealth() <= 0){
                    pokemon.remove(i);
                    i--;
                }
            }
        }
    }

    public boolean isExist(String command){

        for (Pokemon pokemon: pokemon) {
            if (pokemon.getElement().equals(command)){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString (){
        return TrainerName + " " + numberOfBadges + " " + pokemon.size();
    }
}
