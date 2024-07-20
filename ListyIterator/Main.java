package ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String createCommand = scanner.nextLine();
        List<String> listElements = (Arrays.stream(createCommand.split("\\s+"))
                .skip(1).collect(Collectors.toList()));

        ListyIterator listyIterator = new ListyIterator(listElements);

        String command = scanner.nextLine();

        while (!command.equals("END")){
            switch (command){
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (Exception e){
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.printAll(listElements);
            }



            command = scanner.nextLine();
        }
    }
}
