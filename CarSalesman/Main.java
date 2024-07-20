package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int enginesLines = Integer.parseInt(scanner.nextLine());
        List<Engine> enginesList = new ArrayList<>();
        for (int i = 0; i < enginesLines ; i++) {
            String [] engineData = scanner.nextLine().split("\\s+");
            String modelEngine = engineData[0];
            int power = Integer.parseInt(engineData[1]);

            if (engineData.length == 4){
                int displacement = Integer.parseInt(engineData[2]);
                String efficiency = engineData[3];
                Engine engine = new Engine(modelEngine,power,displacement,efficiency);
                enginesList.add(engine);
            } else if (engineData.length == 2) {
                Engine engine = new Engine(modelEngine,power);
                enginesList.add(engine);
            } else if (engineData.length == 3) {
                String thirdParameter = engineData[2];
                if (Character.isDigit(thirdParameter.charAt(0))){
                    int displacement = Integer.parseInt(thirdParameter);
                    Engine engine = new Engine(modelEngine,power,displacement);
                    enginesList.add(engine);
                } else {
                    String efficiency = thirdParameter;
                    Engine engine = new Engine(modelEngine,power,efficiency);
                    enginesList.add(engine);
                }
            }
        }
        int carsLines = Integer.parseInt(scanner.nextLine());

        for (int cars = 1; cars <= carsLines ; cars++) {
            String [] carsData = scanner.nextLine().split("\\s+");

            String modelCar = carsData[0];
            String engine = carsData[1];

            Engine engineCar = null;
            for (Engine engines: enginesList) {
                if (engine.equals(engines.getModel())){
                    engineCar = engines;
                    break;
                }
            }
            if (carsData.length == 4){
                int weight = Integer.parseInt(carsData[2]);
                String color = carsData[3];
                Car car = new Car(modelCar,engineCar,weight,color);
            } else if (carsData.length == 3) {
                String thirdParameter = carsData[2];
                if (Character.isDigit(thirdParameter.charAt(0))){
                    int weight = Integer.parseInt(thirdParameter);
                    Car car = new Car(modelCar,engineCar,weight);
                } else {
                    String color = thirdParameter;
                    Car car = new Car(modelCar,engineCar,color);
                }
            } else if (carsData.length == 2) {
                Car car = new Car(modelCar,engineCar);
            }
        }
        
    }
}
