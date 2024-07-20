package jar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jar <String> jar = new Jar<>();

        jar.add("Blueberry");
        jar.add("Orange");

        System.out.println(jar.remove());


    }
}
