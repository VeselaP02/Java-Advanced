package StacksandQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers_with_aStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numbers.length ; i++) {
            int currentNum = numbers[i];
            stack.push(currentNum);
        }

        while (stack.size() > 0){
            System.out.print(stack.pop() + " ");
        }
    }
}
