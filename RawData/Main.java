package RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,List<Car>> cars = new TreeMap<>();
        for (int i = 0; i < n ; i++) {
            String [] carInformation = scanner.nextLine().split("\\s+");

            String model = carInformation[0];
            int engineSpeed = Integer.parseInt(carInformation[1]);
            int enginePower = Integer.parseInt(carInformation[2]);
            Engine engine = new Engine(engineSpeed,enginePower);
            int cargoWeight = Integer.parseInt(carInformation[3]);
            String cargoType = carInformation[4];
            Cargo cargo = new Cargo(cargoWeight,cargoType);
            List<Tire> tireList = new ArrayList<>();
            for (int tireTimes = 5; tireTimes <= 12 ; tireTimes+=2) {
                Tire currentTire = new Tire(Double.parseDouble(carInformation[tireTimes]),Integer.parseInt(carInformation[tireTimes + 1]));
                tireList.add(currentTire);
            }

            Car currentCar = new Car(model,engine,cargo,tireList);
            cars.putIfAbsent(cargoType,new ArrayList<>());
            cars.get(cargoType).add(currentCar);
        }
        String command = scanner.nextLine();
        cars.get(command).forEach(car -> car.extract(command));
    }
}
