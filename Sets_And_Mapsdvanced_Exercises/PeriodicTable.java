package Sets_And_Mapsdvanced_Exercises;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalElements = new TreeSet<>();

        for (int i = 1; i <= n ; i++) {
            String [] input = scanner.nextLine().split("\\s+");

           Collections.addAll(Arrays.asList(input),chemicalElements);
        }

        for (String uniqueEl: chemicalElements) {
            System.out.print(uniqueEl + " ");
        }
    }
}
