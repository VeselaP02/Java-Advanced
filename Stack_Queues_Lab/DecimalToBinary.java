package Stack_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimal == 0){
            System.out.println("0");
        } else {
            while (decimal != 0){
                int diff = decimal % 2;
                stack.push(diff);
                decimal = decimal /2;
            }
            for (int binary:stack) {
                System.out.print(binary);
            }
        }
    }
}
