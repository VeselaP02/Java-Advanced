package StacksandQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        StringBuilder operations = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 1; i <= countCommands ; i++) {
            String [] input = scanner.nextLine().split("\\s+");

            switch (input[0]){
                case "1":
                    stack.push(operations.toString());
                    operations.append(input[1]);
                    break;
                case "2":
                    stack.push(operations.toString());
                    int countDeleted = Integer.parseInt(input[1]);
                    int startIndex = operations.length() - countDeleted;
                    operations.delete(startIndex,operations.length() + countDeleted);
                    break;
                case "3":
                    int index = Integer.parseInt(input[1]);
                    System.out.println(operations.charAt(index - 1));
                    break;
                case "4":
                    if (!stack.isEmpty()){
                        operations = new StringBuilder(stack.pop());
                    }
                    break;

            }

        }
    }
}
