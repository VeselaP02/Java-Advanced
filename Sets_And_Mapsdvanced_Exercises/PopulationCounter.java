package Sets_And_Mapsdvanced_Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
       LinkedHashMap<String, LinkedHashMap<String,Long>> populationByCountries = new LinkedHashMap<>();

       while (!input.equals("report")){
           String city = input.split("\\|")[0];
           String country = input.split("\\|")[1];
           Long population = Long.parseLong(input.split("\\|")[2]);

           if (!populationByCountries.containsKey(country)){
               populationByCountries.put(country,new LinkedHashMap<>(){{
                   put(city,population);
               }
               });

           } else {
               populationByCountries.get(country).put(city,population);
           }




           input = scanner.nextLine();
       }
    }
}
