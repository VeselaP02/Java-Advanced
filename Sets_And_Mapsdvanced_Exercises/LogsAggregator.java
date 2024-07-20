package Sets_And_Mapsdvanced_Exercises;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Integer> logs = new TreeMap<>();
        TreeMap<String,Set<String>> ips = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String user = input.split("\\s+")[1];
            String IP = input.split("\\s+")[0];
            int duration = Integer.parseInt(input.split("\\s+")[2]);

            if (!logs.containsKey(user)){
                logs.put(user,duration);
            } else {
                int currentDuration = logs.get(user);
                logs.put(user,currentDuration + duration);
            }

            TreeSet<String> Ips = new TreeSet<>();
            Ips.add(IP);
            if (!ips.containsKey(user)){
                ips.put(user,Ips);
            } else {
                Set<String> currentIps = ips.get(user);
                currentIps.add(IP);
                ips.put(user,currentIps);
            }


        }
        logs.forEach((key,value) ->{
            System.out.println(String.format("%s: %d %s", key,value,ips.get(key).toString()));
        });

    }
}
