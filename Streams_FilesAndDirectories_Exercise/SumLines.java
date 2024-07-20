package Streams_FilesAndDirectories_Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {


        String input = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\01._Sum Lines_Ресурси\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> lines = Files.readAllLines(Path.of(input));

        for (String line: lines) {
            int sum = 0;
            for (int i = 0; i < line.length() ; i++) {
                char currentSymbol = line.charAt(i);
                sum += currentSymbol;
            }
            System.out.println(sum);
        }
    }
}
