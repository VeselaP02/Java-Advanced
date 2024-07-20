package Streams_FilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try {FileInputStream input = new FileInputStream(path);
            int oneByte = input.read();
            while (oneByte >= 0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));


                oneByte = input.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
