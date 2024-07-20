package Streams_FilesAndDirectories_Exercise;

import java.io.*;

public class ALL_CAPITALS {
    public static void main(String[] args) throws IOException {

        String input = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\01._Sum Lines_Ресурси\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader br = new BufferedReader(new FileReader(input));
        PrintWriter output = new PrintWriter(new FileOutputStream("output.txt"));
        String line = br.readLine();

        while (line != null){
            for (int index = 0; index < line.length() ; index++) {
                String currentSymbol = String.valueOf(line.charAt(index));
                output.write(currentSymbol.toUpperCase());
            }
            output.println();

            line = br.readLine();
        }
        output.close();
    }
}
