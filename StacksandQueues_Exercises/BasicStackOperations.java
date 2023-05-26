package StacksandQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] modifyNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = modifyNumbers[0];
        int s = modifyNumbers[1];
        int x = modifyNumbers[2];


        for (int i = 0; i < n; i++) {
            int currentNumber = numbers[i];
            stack.push(currentNumber);
        }
        for (int i = 1; i <= s ; i++) {
            stack.pop();
        }
        int minNumber = Integer.MAX_VALUE;

        if (stack.isEmpty()){
            System.out.println("0");
        } else if (stack.contains(x)) {
                    System.out.println("true");

                } else {
                    for (int min : stack) {
                        if (min < minNumber) {
                            minNumber = min;
                        }

                    }
                    System.out.println(minNumber);
                }

        }


    }
