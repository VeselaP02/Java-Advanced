package Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n  = Integer.parseInt(scanner.nextLine());
        List<Car> carsCollections = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String [] command = scanner.nextLine().split("\\s+");

            Constructors.Car car;
            String brand = command[0];
            if (command.length == 1) {
                car = new Constructors.Car(brand);
            } else {
                String model = command[1];
                int horsePower = Integer.parseInt(command[2]);
                car = new Constructors.Car(brand,model,horsePower);
            }

            carsCollections.add(car);
        }
        carsCollections.forEach(car -> System.out.println(car.carInfo()));
    }
}
