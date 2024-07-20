package SetsAndMaps_Advanced_Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> listWithGuests = new LinkedHashSet<>();
        Set<String> comingGuest = new LinkedHashSet<>();

        while (!input.equals("PARTY")){
           listWithGuests.add(input);

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();

        while (!command.equals("END")){
            comingGuest.add(command);


            command = scanner.nextLine();
        }

        Set<String> notComeGuest = new TreeSet<>();
        for (String guest:listWithGuests) {
            if (!comingGuest.contains(guest)){
                notComeGuest.add(guest);
            }
        }
        System.out.println(notComeGuest.size());
        for (String currentGuest: notComeGuest) {

            System.out.println(currentGuest);
        }

    }
}
