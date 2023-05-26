package Stack_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> files = new ArrayDeque<>();

        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (files.size() ==0){
                    System.out.println("Printer is on standby");
                } else {
                   String firstFile =  files.poll();
                    System.out.printf("Canceled %s%n",firstFile);
                }
            } else {
                files.offer(input);
            }



            input = scanner.nextLine();
        }
        for (String currentFile:files) {
            System.out.printf("%s%n",currentFile);
        }
    }
}
