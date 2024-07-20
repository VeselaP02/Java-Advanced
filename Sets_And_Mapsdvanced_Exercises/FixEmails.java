package Sets_And_Mapsdvanced_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        Map<String,String> users = new LinkedHashMap<>();

        while (!user.equals("stop")){
            String email =  scanner.nextLine();


            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("or") && !email.endsWith("com")){
                users.put(user,email);
            }


            user = scanner.nextLine();
        }
        users.entrySet().forEach(entry-> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
