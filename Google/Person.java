package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private Car car;
    private List<Pokemon> pokemonList;
    private List<Parents> parentsList;
    private List<Children> childrenList;

    public Person() {
        this.childrenList = new ArrayList<>();
        this.parentsList = new ArrayList<>();
        this.pokemonList = new ArrayList<>();
    }

    public Person(Company company, Car car, List<Pokemon> pokemonList, List<Parents> parentsList, List<Children> childrenList) {
        this.company = company;
        this.car = car;
        this.pokemonList = pokemonList;
        this.parentsList = parentsList;
        this.childrenList = childrenList;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public List<Parents> getParentsList() {
        return parentsList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Company:").append("\n");
        if (company != null){
            sb.append(company).append("\n");
        }
        sb.append("Car:").append("\n");
        if (car != null){
            sb.append(car).append("\n");
        }
        sb.append("Pokemon:").append("\n");
        for (Pokemon pokemon: pokemonList) {
            sb.append(pokemon).append("\n");
        }
        sb.append("Parents:").append("\n");
        for (Parents parent:parentsList) {
            sb.append(parent).append(System.lineSeparator());
        }
        sb.append("Children:").append("\n");
        for (Children child:childrenList) {
            sb.append(child).append("\n");
        }
        return sb.toString();
    }
}
