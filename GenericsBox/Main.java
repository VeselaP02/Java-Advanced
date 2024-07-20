package GenericsBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();

        for (int i = 1; i <= n ; i++) {
            Double number = Double.parseDouble(scanner.nextLine());
            box.add(number);
        }

        Double compareElement =Double.parseDouble(scanner.nextLine());
        int count = box.counter(compareElement);

        System.out.println(count);
    }
}
