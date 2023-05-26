package Stack_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] children = scanner.nextLine().split(" ");
        int toss = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> circle = new ArrayDeque<>();
        Collections.addAll(circle,children);

        while (circle.size() > 1){
            for (int i = 1; i < toss ; i++) {
                String currentChild = circle.poll();
                circle.offer(currentChild);
            }
            String removedChild = circle.poll();
            System.out.printf("Removed %s%n",removedChild);
        }
        System.out.printf("Last is %s%n",circle.peek());
    }
}
