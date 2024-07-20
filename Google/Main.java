package Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Map<String, Person> personData = new HashMap<>();

        while (!input.equals("End")){
            String [] personInformation = input.split("\\s+");
            String namePerson = personInformation[0];
            String command = personInformation[1];
            if (!personData.containsKey(namePerson)){
                personData.put(namePerson,new Person());
            }

            switch (command){
                case "company":
                    String companyName = personInformation[2];
                    String department = personInformation[3];
                    double salary = Double.parseDouble(personInformation[4]);
                    Company company = new Company(companyName,department,salary);
                    personData.get(namePerson).setCompany(company);
                    break;
                case "car":
                    String carModel = personInformation[2];
                    int carSpeed = Integer.parseInt(personInformation[3]);
                    Car car  = new Car(carModel,carSpeed);
                    personData.get(namePerson).setCar(car);
                    break;
                case "parents":
                    String parentName = personInformation[2];
                    String parentBirthday = personInformation[3];
                    Parents parents = new Parents(parentName,parentBirthday);
                    personData.get(namePerson).getParentsList().add(parents);
                    break;
                case "pokemon":
                    String pokemonName = personInformation[2];
                    String pokemonType = personInformation[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    personData.get(namePerson).getPokemonList().add(pokemon);
                    break;
                case "children":
                    String childName = personInformation[2];
                    String childBirthday = personInformation[3];
                    Children children = new Children(childName,childBirthday);
                    personData.get(namePerson).getChildrenList().add(children);
                    break;
            }

            input = scanner.nextLine();
        }
        String searchedPeron = scanner.nextLine();
        System.out.println(searchedPeron);

        Person personInf = personData.get(searchedPeron);
        System.out.println(personInf);
    }
}
