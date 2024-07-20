package Sets_And_Mapsdvanced_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 1; i <= n ; i++) {
            String currentUsername = scanner.nextLine();
            usernames.add(currentUsername);
        }

        for (String currentUser: usernames) {
            System.out.println(currentUser);
        }
    }
}