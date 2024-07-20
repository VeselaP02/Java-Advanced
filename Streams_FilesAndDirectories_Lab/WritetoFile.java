package Streams_FilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WritetoFile {
    public static void main(String[] args) throws IOException {

        String input = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";


        Set<Character> forbitenSymbols = new HashSet<>();
        Collections.addAll(forbitenSymbols, ',', '.', '?', '!');

        try (FileInputStream inPath = new FileInputStream(input);
            FileOutputStream outPath = new FileOutputStream(output);){
            int oneByte = inPath.read();
            while (oneByte >= 0) {
                if (!forbitenSymbols.contains((char)oneByte)) {
                    outPath.write(oneByte);
                }

                oneByte = inPath.read();
            }
        } catch (IOException e){

        }
    }
}
