package Sets_And_Mapsdvanced_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String,Integer>> users = new TreeMap<>();

        while (!input.equals("end")){
            String [] inputParts = input.split("\\s+");
            String username = inputParts[2].split("=")[1];
            String ip = inputParts[0].split("=")[1];

            if (!users.containsKey(username)){
                users.put(username, new LinkedHashMap<>(){{
                    put(ip,1);
                }});
                } else {
                Map<String,Integer> currentIps = users.get(username);
                if (currentIps.containsKey(ip)){
                    int currentTimes = currentIps.get(ip);
                    currentIps.put(ip,currentTimes + 1);
                } else {
                    currentIps.put(ip,1);
                }
            }



            input = scanner.nextLine();
        }
        users.keySet().forEach(username -> {
            System.out.println(username + ": ");
            Map<String,Integer> ips = users.get(username);

            int countIps = ips.size();
            for (String ip: ips.keySet()) {
                if (countIps == 1){
                    System.out.println(ip + " => " + ips.get(ip) + ".");
                } else {
                    System.out.print(ip + " => " + ips.get(ip) + ", ");
                    countIps--;
                }
            }

        });



    }
}
