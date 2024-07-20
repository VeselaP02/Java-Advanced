package scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scale<String> scale = new Scale<>("Peter","Mihaela");

        System.out.println(scale.getHeaver());
    }
}
