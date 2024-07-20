package SetsAndMaps_Advanced_Lab;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> carsNumbers = new LinkedHashSet<>();

        while (!input.equals("END")){
            String direction = input.split(", ")[0];
            String carNumber = input.split(", ")[1];
            
            if (direction.equals("IN")){
                carsNumbers.add(carNumber);
            } else if (direction.equals("OUT")) {
                carsNumbers.remove(carNumber);
            }


            input = scanner.nextLine();
        }

        if (carsNumbers.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String currentCarNumber: carsNumbers) {
                System.out.println(currentCarNumber);
            }
        }
    }
}
