package RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;



    public Car(String model,Engine engine, Cargo cargo, List<Tire> tire) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tire;
    }

    public void extract (String command){
        switch (command){
            case "fragile":
                for (Tire tire: tires) {
                    double pressure = tire.getTirePressure();
                    if (pressure < 1){
                        System.out.println(model);
                        break;
                    }
                }
                break;
            case "flamable":
                int power = engine.getEnginePower();
                if (power > 250){
                    System.out.println(model);
                }
                break;
        }
    }


}
