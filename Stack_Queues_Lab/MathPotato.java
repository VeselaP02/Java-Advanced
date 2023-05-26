package Stack_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] children = scanner.nextLine().split(" ");
        int toss = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> circle = new ArrayDeque<>();


        int cycle = 1;
            for (int i = 0; i < children.length ; i++) {
                String currentChild = children[i];
                circle.offer(currentChild);
            }

            while (circle.size() > 1){
            for (int i = 1; i <= toss ; i++) {
                String changePositionChild = circle.poll();
                circle.offer(changePositionChild);


            }
                if (isPrime(cycle)) {
                    System.out.printf("Prime %s%n", circle.peek());
                } else {
                    System.out.printf("Removed %s%n", circle.poll());

                }
                cycle++;


        }
    }
    public static boolean isPrime (int cycle){
        if (cycle % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
