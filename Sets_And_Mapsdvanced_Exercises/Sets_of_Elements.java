package Sets_And_Mapsdvanced_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        int  m = Integer.parseInt(input[0]);
        int n =  Integer.parseInt(input[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <= m ; i++) {
            int numbersFirstSet = Integer.parseInt(scanner.nextLine());
            firstSet.add(numbersFirstSet);
        }

        for (int i = 1; i <= n ; i++) {
            int secondNumberSet = Integer.parseInt(scanner.nextLine());
            secondSet.add(secondNumberSet);
        }

        firstSet.retainAll(secondSet);
        for (int element: firstSet) {
            System.out.print(element + " ");
        }
    }
}
