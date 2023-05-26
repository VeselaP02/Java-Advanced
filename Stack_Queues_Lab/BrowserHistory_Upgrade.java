package Stack_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> stackForward = new ArrayDeque<>();


        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (stack.size() > 1) {
                        String currentRemoved = stack.pop();
                        stackForward.push(currentRemoved);
                        String currentURl = stack.peek();
                        System.out.println(currentURl);
                } else {
                    System.out.println("no previous URLs");
                }

            } else if (input.equals("forward")) {
                if (stackForward.size() >= 1){
                    stack.push(stackForward.pop());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                stack.push(input);
                stackForward = new ArrayDeque<>();
                System.out.println(input);
            }

                input = scanner.nextLine();
        }
    }
}
