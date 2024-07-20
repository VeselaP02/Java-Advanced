package SetsAndMaps_Advanced_Lab;

import java.util.*;

public class CitiesbyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> map = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String continents = input.split("\\s+")[0];
            String countries = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            if (!map.containsKey(continents)){
                map.put(continents, new LinkedHashMap<>(){{
                    put(countries,new ArrayList<>(){{
                        add(city);
                    }});
                }});
            } else {
                LinkedHashMap<String,List<String>> currentMAP = map.get(continents);
                List<String> currentCities = currentMAP.get(countries);

                if (currentMAP.containsKey(countries)){
                    currentCities.add(city);
                    currentMAP.put(countries,currentCities);
                    map.put(continents,currentMAP);
                } else {
                    currentMAP.put(countries,new ArrayList<>(){{
                        add(city);
                    }});
                    map.put(continents,currentMAP);
                }
            }

        }
        map.keySet().forEach(entry-> {
            System.out.println(entry + ":");
            Map<String,List<String>> countries = map.get(entry);


            for (String country: countries.keySet()) {
                List<String> list = countries.get(country);
                System.out.print(" " + country + " -> ");
                for (int i = 0; i < list.size() ; i++) {
                    String currentCity = list.get(i);
                    if (i == list.size() - 1){
                        System.out.println( currentCity);
                    } else {
                        System.out.print(currentCity + ", ");
                    }
                }

            }

        });
    }
}
