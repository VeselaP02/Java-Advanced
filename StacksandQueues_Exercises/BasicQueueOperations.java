package StacksandQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] modifyNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = modifyNumbers[0];
        int s = modifyNumbers[1];
        int x = modifyNumbers[2];


        for (int i = 0; i < n; i++) {
            int currentNumber = numbers[i];
            queue.offer(currentNumber);
        }
        for (int i = 1; i <= s ; i++) {
            queue.poll();
        }
        int minNumber = Integer.MAX_VALUE;

        if (queue.isEmpty()){
            System.out.println("0");
        } else if (queue.contains(x)) {
            System.out.println("true");

        } else {
            for (int min : queue) {
                if (min < minNumber) {
                    minNumber = min;
                }

            }
            System.out.println(minNumber);
        }

    }
}
