package Streams_FilesAndDirectories_Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String inPath = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt";


        Path inPUT = Paths.get(inPath);
        Path outPut  = Paths.get(outPath);

        List<String> lines = Files.readAllLines(inPUT);
        Collections.sort(lines);
        Files.write(outPut,lines);


    }
}
