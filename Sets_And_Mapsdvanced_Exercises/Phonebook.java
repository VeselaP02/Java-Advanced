package Sets_And_Mapsdvanced_Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();
        Map<String,String> phoneBook = new HashMap<>();

        while (!input.equals("search")){
            String name = input.split("-")[0];
            String phone = input.split("-")[1];

            if (!phoneBook.containsKey(name)){
                phoneBook.put(name,phone);
            } else {
                phoneBook.put(name,phone);
            }


             input = scanner.nextLine();
        }
        String names = scanner.nextLine();
        while (!names.equals("stop")){
            if (phoneBook.containsKey(names)){
                System.out.println(names + " -> " + phoneBook.get(names));
            } else {
                System.out.printf("Contact %s does not exist.%n",names);
            }



            names = scanner.nextLine();
        }
    }
}
