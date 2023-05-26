package StacksandQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= nCommands ; i++) {
            String input = scanner.nextLine();
            if (input.contains("1")){
                String [] inputPart = input.split(" ");
                int X = Integer.parseInt(inputPart[1]);
                stack.push(X);
            } else if (input.equals("2")) {
                stack.pop();

            } else if (input.equals("3")) {
                int minNumber = Integer.MIN_VALUE;
                for (int min: stack) {
                    if (min > minNumber){
                        minNumber = min;
                    }
                }
                System.out.println(minNumber);
            }
        }
    }
}
