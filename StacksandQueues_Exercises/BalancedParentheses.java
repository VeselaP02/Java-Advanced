package StacksandQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();

        boolean areBalanced = false;
        for (int i = 0; i < input.length() ; i++) {

            char currentBrackets = input.charAt(i);

            if (currentBrackets == '{' || currentBrackets == '[' || currentBrackets == '('){
                openBracketsStack.push(currentBrackets);
            } else if (currentBrackets == '}' || currentBrackets == ']' || currentBrackets == ')') {
                if (openBracketsStack.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char lastOpenBracket = openBracketsStack.pop();

                if (lastOpenBracket == '{' && currentBrackets == '}') {
                    areBalanced = true;
                } else if (lastOpenBracket == '[' && currentBrackets == ']') {
                    areBalanced = true;
                } else if (lastOpenBracket == '(' && currentBrackets == ')') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }
        if (areBalanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
